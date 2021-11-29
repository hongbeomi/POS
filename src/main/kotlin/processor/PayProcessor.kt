package processor

import pay.Pay
import strong_box.StrongBox
import calculator.PriceCalculator
import menu.PayMenuSelector
import printer.PayPrinter
import printer.Printer

class PayProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val selector: PayMenuSelector = PayMenuSelector(),
    private val printer: Printer = PayPrinter(),
    private val strongBox: StrongBox = StrongBox
) : Processor {

    override fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            val amount = strongBox.plusAmount(allPrice)

            val payData = Pay(allPrice, amount)

            printer.print(payData)
        } else {
            printer.error()
        }
    }

}