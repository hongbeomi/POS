import processor.*
import command.Command
import printer.POSMachinePrinter

class POSMachineApplication(
    private val printer: POSMachinePrinter = POSMachinePrinter(),
    private val payProcessor: PayProcessor = PayProcessor(),
    private val cashUpProcessor: CashUpProcessor = CashUpProcessor(),
    private val exitProcessor: ExitProcessor = ExitProcessor()
) {

    private val commandCorrectCondition: (Int) -> Boolean = {
        (it - 1) in 0 until Command.values().size
    }

    fun run() {
        printer.start()
        readCommand()
    }

    private fun readCommand() {
        while (true) {
            printer.print()

            val ordinal = readLine()?.toIntOrNull()

            if (ordinal != null && commandCorrectCondition.invoke(ordinal)) {
                runProcess(ordinal)
            } else {
                continue
            }
        }
    }

    private fun runProcess(input: Int) {
        when (Command.values()[input - 1]) {
            Command.PAY -> payProcessor.process()
            Command.CASH_UP -> cashUpProcessor.process()
            else -> exitProcessor.process()
        }
    }

}