package ui.view

import model.Menu
import model.Pay
import selector.PayMenuSelector
import processor.PayProcessor
import processor.Processor
import util.formatPlusWon

class PayView(
    private val selector: PayMenuSelector = PayMenuSelector(),
    private val processor: PayProcessor = PayProcessor()
) : POSView {

    override fun show() {
        val selectedMenuList = readMenu()
        processor.updateSelectedMenuList(selectedMenuList)
        val pay = processor.process()

        if (pay != null) {
            println("총 ${pay.allPrice.formatPlusWon()}이 결제되었습니다!")
            println("금고에 있는 총 잔고는 ${pay.amount.formatPlusWon()}입니다!")
        } else {
            println("선택된 메뉴가 없습니다.")
        }
    }

    private fun readMenu(): MutableList<Menu> {
        while (true) {
            println(
                """
                
                - 음식을 계산합니다 -
                드셨던 음식들을 선택해주세요!
                1. 피자
                2. 커피
                3. 치킨
                4. 햄버거
                5. 선택완료
            """.trimIndent()
            )
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal != null && Menu.isCorrectedSelect(ordinal - 1) -> {
                    val menu = Menu.values()[ordinal - 1]
                    println("${menu.nameKR}가(이) 선택되었습니다. 추가 선택을 완료해주세요")
                    selector.select(menu)
                }
                ordinal == 5 -> break
                else -> {
                    println("유효하지 않은 입력입니다\n")
                    continue
                }
            }
        }
        return selector.menuList
    }

}