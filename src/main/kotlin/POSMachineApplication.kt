import processor.*
import command.Command
import printer.POSMachinePrinter

class POSMachineApplication(
    private val printer: POSMachinePrinter = POSMachinePrinter()
) {

    fun run() {
        printer.start()
        while (true) {
            readCommand()
        }
    }

    private fun readCommand() {
        printer.print()
        val input = readLine()
        runProcess(input)
    }

    private fun runProcess(input: String?) {
        val ordinal = input?.toIntOrNull()

        if (ordinal == null || (ordinal - 1) !in 0 until Command.values().size) {
            return
        } else {
            when (Command.values()[ordinal - 1]) {
                Command.ORDER -> OrderProcessor().process()
                Command.PAY -> PayProcessor().process()
                Command.CASH_UP -> CashUpProcessor().process()
                else -> ExitProcessor().process()
            }
        }
    }

}