package printer

import util.formatPlusWon

class OrderPrinter {

    fun printOrder(allPrice: Int) {
        println("총 ${allPrice.formatPlusWon()}의 음식들이 주문되었습니다!")
    }

    fun printError() {
        println("주문한 메뉴가 없습니다.")
    }

}