package processor

import util.formatPlusWon

class CashUpProcessor  {

    fun process() {
        val revenue = 1500000
        println(
            """
                - 정산을 시작합니다 -
                오늘 총 매출은 ${revenue.formatPlusWon()}입니다
            """.trimIndent()
        )
    }

}