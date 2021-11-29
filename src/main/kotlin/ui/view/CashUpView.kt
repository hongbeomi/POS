package ui.view

import processor.CashUpProcessor
import processor.Processor
import util.formatPlusWon

class CashUpView(
    private val cashUpProcessor: Processor<Int> = CashUpProcessor()
) : POSView {

    override fun show() {
        val revenue = cashUpProcessor.process()

        println(
            """
                - 정산을 시작합니다 -
                오늘 총 매출은 ${revenue.formatPlusWon()}입니다
            """.trimIndent()
        )
    }

}