package processor

import StrongBox
import printer.CashUpPrinter
import printer.Printer

class CashUpProcessor(
    private val printer: Printer = CashUpPrinter(),
    private val strongBox: StrongBox = StrongBox
) : Processor {

    override fun process() {
        val revenue = strongBox.amount
        printer.print(revenue)
    }

}