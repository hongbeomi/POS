package processor

import printer.ExitPrinter
import printer.Printer
import kotlin.system.exitProcess

class ExitProcessor(
    private val printer: Printer = ExitPrinter()
) : Processor {

    override fun process() {
        printer.print()
        exitProcess(0)
    }

}