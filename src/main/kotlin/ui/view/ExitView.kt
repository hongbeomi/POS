package ui.view

import processor.ExitProcessor
import processor.Processor

class ExitView(
    private val exitProcessor: Processor<*> = ExitProcessor()
) : POSView {

    override fun show() {
        println("포스기 종료!")
        exitProcessor.process()
    }

}