package menu

import printer.MenuPrinter
import printer.PayMenuPrinter

class PayMenuSelector(
    private val printer: MenuPrinter = PayMenuPrinter()
) {

    private val menuCorrectCondition: (Int) -> Boolean = {
        (it - 1) in 0 until Menu.values().size
    }

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            printer.printMenu()
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal != null && menuCorrectCondition.invoke(ordinal) -> {
                    val menu = Menu.values()[ordinal - 1]
                    printer.print(menu.nameKR)
                    menuList.add(menu)
                }
                ordinal == 5 -> break
                else -> {
                    printer.error()
                    continue
                }
            }
        }
        return menuList
    }

}