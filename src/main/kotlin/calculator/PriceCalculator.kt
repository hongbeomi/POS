package calculator

import model.Menu

class PriceCalculator {

    fun calculate(menuList: List<Menu>) = menuList.sumBy { it.price }

}