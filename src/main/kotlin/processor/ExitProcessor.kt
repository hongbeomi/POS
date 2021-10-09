package processor

import kotlin.system.exitProcess

class ExitProcessor {

    fun process() {
        println("포스기 종료!")
        exitProcess(0)
    }

}