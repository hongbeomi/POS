package processor

import kotlin.system.exitProcess

class ExitProcessor : Processor<Unit> {

    override fun process() {
        exitProcess(0)
    }

}