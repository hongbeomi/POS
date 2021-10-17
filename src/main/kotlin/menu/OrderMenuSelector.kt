package menu

import printer.MenuPrinter
import printer.OrderMenuPrinter

class OrderMenuSelector(
    printer: MenuPrinter = OrderMenuPrinter()
) : MenuSelector(printer)