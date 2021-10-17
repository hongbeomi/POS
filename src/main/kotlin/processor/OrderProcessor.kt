package processor

import calculator.PriceCalculator
import menu.Menu
import menu.OrderMenuSelector
import printer.OrderPrinter
import printer.Printer

class OrderProcessor(
    calculator: PriceCalculator = PriceCalculator(),
    selector: OrderMenuSelector = OrderMenuSelector(),
    printer: Printer = OrderPrinter()
) : MenuProcessor(calculator, selector, printer)