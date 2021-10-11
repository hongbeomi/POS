package printer

class POSMachinePrinter {

    fun printRun() {
        println("<< 포스기 시작 >>")
    }

    fun printCommand() {
        println(
            """
                
                - 진행할 작업을 선택해주세요 -
                1. 주문하기
                2. 계산하기
                3. 정산하기
                4. 종료하기
            """.trimIndent()
        )
    }

}