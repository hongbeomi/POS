package processor

import printer.CashUpPrinter
import printer.Printer

class CashUpProcessor(
    private val printer: Printer = CashUpPrinter()
) : Processor {

    override fun process() {
        val revenue = 1500000
        printer.print(revenue)
    }

}