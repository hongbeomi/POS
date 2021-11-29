package processor

import model.Pay
import strong_box.StrongBox
import calculator.PriceCalculator
import model.Menu

class PayProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val strongBox: StrongBox = StrongBox
) : Processor<Pay?> {

    private val selectedMenuList: MutableList<Menu> = mutableListOf()

    fun updateSelectedMenuList(values: List<Menu>) {
        selectedMenuList.clear()
        selectedMenuList.addAll(values)
    }

    override fun process(): Pay? {
        return if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            val amount = strongBox.plusAmount(allPrice)
            Pay(allPrice, amount)
        } else {
            null
        }
    }

}