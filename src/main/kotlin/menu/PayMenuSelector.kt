package menu

import printer.PayMenuPrinter

class PayMenuSelector(
    private val printer: PayMenuPrinter = PayMenuPrinter()
) {

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            printer.printCommand()
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal == 5 -> break
                ordinal == null || (ordinal - 1) !in 0 until Menu.values().size -> {
                    printer.printError()
                    continue
                }
                else -> {
                    val menu = Menu.values()[ordinal - 1]
                    printer.printSelectedName(menu.nameKR)
                    menuList.add(menu)
                }
            }
        }
        return  menuList
    }

}