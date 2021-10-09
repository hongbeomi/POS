import processor.*
import command.Command

class POSMachineApplication {

    fun run() {
        println("<< 포스기 시작 >>")
        while (true) {
            selectOption()
        }
    }

    private fun selectOption() {
        println(
            """
                
                - 진행할 작업을 선택해주세요 -
                1. 주문하기
                2. 계산하기
                3. 정산하기
                4. 종료하기
            """.trimIndent()
        )
        val input = readLine()
        startProcess(input)
    }

    private fun startProcess(input: String?) {
        val ordinal = input?.toIntOrNull()

        if (ordinal == null || (ordinal - 1) !in 0 until Command.values().size) {
            return
        } else {
            when (Command.values()[ordinal - 1]) {
                Command.ORDER -> OrderProcessor().process()
                Command.PAY -> PayProcessor().process()
                Command.CASHUP -> CashUpProcessor().process()
                else -> OffProcessor().process()
            }
        }
    }

}