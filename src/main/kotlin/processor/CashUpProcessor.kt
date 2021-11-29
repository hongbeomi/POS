package processor

import strong_box.StrongBox
import printer.CashUpPrinter
import printer.Printer

class CashUpProcessor(
    private val printer: Printer = CashUpPrinter(),
    private val strongBox: StrongBox = StrongBox
) : Processor {

    override fun process() {
        val revenue = strongBox.currentAmount()
        printer.print(revenue)
    }

}