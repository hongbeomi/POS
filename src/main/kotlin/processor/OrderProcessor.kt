package processor

import calculator.PriceCalculator
import menu.OrderMenuSelector
import util.formatPlusWon

class OrderProcessor(
    private val calculator: PriceCalculator = PriceCalculator(),
    private val selector: OrderMenuSelector = OrderMenuSelector()
)  {

    fun process() {
        val selectedMenuList = selector.select()

        if (selectedMenuList.isNotEmpty()) {
            val allPrice = calculator.calculate(selectedMenuList)
            println("총 ${allPrice.formatPlusWon()}의 음식들이 주문되었습니다!")
        } else {
            println("주문한 메뉴가 없습니다.")
        }
    }

}