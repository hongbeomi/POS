package printer

import util.formatPlusWon

class CashUpPrinter : Printer {

    override fun print(argument: Any?) {
        val revenue = argument as? Int
        revenue ?: return

        println(
            """
                - 정산을 시작합니다 -
                오늘 총 매출은 ${revenue.formatPlusWon()}입니다
            """.trimIndent()
        )
    }

}