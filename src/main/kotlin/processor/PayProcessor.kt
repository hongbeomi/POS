package processor

import calculator.PriceCalculator
import menu.PayMenuSelector
import printer.PayPrinter
import printer.Printer

class PayProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val selector: PayMenuSelector = PayMenuSelector(),
    private val printer: Printer = PayPrinter()
) : Processor {

    override fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            printer.print(allPrice)
        } else {
            printer.error()
        }
    }

}