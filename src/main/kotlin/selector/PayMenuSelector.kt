package selector

import model.Menu


class PayMenuSelector {

    val menuList = mutableListOf<Menu>()

    fun select(menu: Menu) {
        menuList.add(menu)
    }

}