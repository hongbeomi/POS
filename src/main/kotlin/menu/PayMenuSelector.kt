package menu

import printer.MenuPrinter
import printer.PayMenuPrinter

class PayMenuSelector(
    val printer: MenuPrinter = PayMenuPrinter()
) : MenuSelector(printer)