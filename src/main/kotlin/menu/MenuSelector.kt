package menu

import printer.MenuPrinter

abstract class MenuSelector(
    private val menuPrinter: MenuPrinter
) {

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            menuPrinter.printMenu()
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal == 5 -> break
                ordinal == null || (ordinal - 1) !in 0 until Menu.values().size -> {
                    menuPrinter.error()
                    continue
                }
                else -> {
                    val menu = Menu.values()[ordinal - 1]
                    menuPrinter.print(menu.nameKR)
                    menuList.add(menu)
                }
            }
        }
        return  menuList
    }
}