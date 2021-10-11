package processor

import printer.ExitPrinter
import kotlin.system.exitProcess

class ExitProcessor(
    private val printer: ExitPrinter = ExitPrinter()
) {

    fun process() {
        printer.print()
        exitProcess(0)
    }

}