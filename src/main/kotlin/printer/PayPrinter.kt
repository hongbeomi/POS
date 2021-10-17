package printer

import util.formatPlusWon

class PayPrinter : Printer {

    override val errorText: String = "선택된 메뉴가 없습니다."

    override fun print(argument: Any?) {
        val allPrice = argument as? Int
        allPrice ?: return

        println("총 ${allPrice.formatPlusWon()}이 결제되었습니다!")
    }

}