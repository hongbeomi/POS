package calculator

import menu.Menu

class OrderPriceCalculator {

    fun calculate(menuList: List<Menu>): Int {
        var sumPrice = 0

        menuList.forEach {
            sumPrice += it.price
        }
        return sumPrice
    }

}