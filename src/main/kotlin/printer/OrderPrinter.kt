package printer

import util.formatPlusWon

class OrderPrinter: Printer {

    override val errorText: String = "주문한 메뉴가 없습니다."

    override fun print(argument: Any?) {
        val allPrice = argument as? Int
        allPrice ?: return

        println("총 ${allPrice.formatPlusWon()}의 음식들이 주문되었습니다!")
    }

}