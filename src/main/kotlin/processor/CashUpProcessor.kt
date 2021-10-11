package processor

import printer.CashUpPrinter

class CashUpProcessor(
    private val printer: CashUpPrinter = CashUpPrinter()
)  {

    fun process() {
        val revenue = 1500000
        printer.print(revenue)
    }

}