package printer

import util.formatPlusWon

class CashUpPrinter {

    fun print(revenue: Int) {
        println(
            """
                - 정산을 시작합니다 -
                오늘 총 매출은 ${revenue.formatPlusWon()}입니다
            """.trimIndent()
        )
    }

}