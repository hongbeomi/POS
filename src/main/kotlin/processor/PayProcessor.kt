package processor

import calculator.PayPriceCalculator
import menu.PayMenuSelector
import util.formatPlusWon

class PayProcessor(
    private val calculator: PayPriceCalculator = PayPriceCalculator(),
    private val selector: PayMenuSelector = PayMenuSelector()
)  {

    fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            println("총 ${allPrice.formatPlusWon()}이 결제되었습니다!")
        } else {
            println("선택된 메뉴가 없습니다.")
        }
    }

}