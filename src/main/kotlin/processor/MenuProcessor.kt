package processor

import calculator.PriceCalculator
import menu.MenuSelector
import printer.Printer

abstract class MenuProcessor(
    private val calculator: PriceCalculator,
    private val selector: MenuSelector,
    private val printer: Printer
): Processor {

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