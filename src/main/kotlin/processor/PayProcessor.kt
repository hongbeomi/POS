package processor

import calculator.PriceCalculator
import menu.PayMenuSelector
import printer.PayPrinter

class PayProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val selector: PayMenuSelector = PayMenuSelector(),
    private val printer: PayPrinter = PayPrinter()
)  {

    fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            printer.printPrice(allPrice)
        } else {
            printer.printError()
        }
    }

}