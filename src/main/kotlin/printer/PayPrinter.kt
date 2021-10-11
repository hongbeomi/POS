package printer

import util.formatPlusWon

class PayPrinter {

    fun printPrice(allPrice: Int) {
        println("총 ${allPrice.formatPlusWon()}이 결제되었습니다!")
    }

    fun printError() {
        println("선택된 메뉴가 없습니다.")
    }

}