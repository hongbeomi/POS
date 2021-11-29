package ui.view

import ui.router.ViewRouter
import command.Command
import ui.router.ViewPath

class MainView(
    private val router: ViewRouter = ViewRouter()
) : POSView {

    override fun show() {
        println("<< 포스기 시작 >>")
        readCommand()
    }

    private fun readCommand() {
        while (true) {
            println(
                """
                
                - 진행할 작업을 선택해주세요 -              
                1. 계산하기
                2. 정산하기
                3. 종료하기
            """.trimIndent()
            )

            val ordinal = readLine()?.toIntOrNull()

            if (ordinal != null && ViewPath.isCorrectedPath(ordinal - 1)) {
                router.route(ordinal - 1)
            } else {
                continue
            }
        }
    }

}