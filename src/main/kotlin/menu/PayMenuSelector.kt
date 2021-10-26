package menu

import printer.MenuPrinter
import printer.PayMenuPrinter

class PayMenuSelector(
    val printer: MenuPrinter = PayMenuPrinter()
) {

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            printer.printMenu()
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal == 5 -> break
                ordinal == null || (ordinal - 1) !in 0 until Menu.values().size -> {
                    printer.error()
                    continue
                }
                else -> {
                    val menu = Menu.values()[ordinal - 1]
                    printer.print(menu.nameKR)
                    menuList.add(menu)
                }
            }
        }
        return menuList
    }

}