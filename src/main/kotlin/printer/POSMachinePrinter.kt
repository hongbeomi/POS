package printer

class POSMachinePrinter : Printer {

    fun start() {
        println("<< 포스기 시작 >>")
    }

    override fun print(argument: Any?) {
        println(
            """
                
                - 진행할 작업을 선택해주세요 -              
                1. 계산하기
                2. 정산하기
                3. 종료하기
            """.trimIndent()
        )
    }

}