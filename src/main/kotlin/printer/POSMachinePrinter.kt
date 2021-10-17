package printer

class POSMachinePrinter : Printer {

    fun start() {
        println("<< 포스기 시작 >>")
    }

    override fun print(argument: Any?) {
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