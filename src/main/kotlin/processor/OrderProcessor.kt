package processor

import calculator.PriceCalculator
import menu.OrderMenuSelector
import printer.OrderPrinter

class OrderProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val selector: OrderMenuSelector = OrderMenuSelector(),
    private val printer: OrderPrinter = OrderPrinter()
)  {

    fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            printer.printOrder(allPrice)
        } else {
            printer.printError()
        }
    }

}