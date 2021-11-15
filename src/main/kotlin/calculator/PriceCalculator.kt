package calculator

import menu.Menu

class PriceCalculator {

    fun calculate(menuList: List<Menu>) = menuList.sumBy { it.price }

}