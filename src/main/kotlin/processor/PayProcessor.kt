package processor

import calculator.PriceCalculator
import menu.PayMenuSelector
import printer.PayPrinter
import printer.Printer

class PayProcessor(
    calculator: PriceCalculator = PriceCalculator(),
    selector: PayMenuSelector = PayMenuSelector(),
    printer: Printer = PayPrinter()
)  : MenuProcessor(calculator, selector, printer)