package printer

import model.PayData
import util.formatPlusWon

class PayPrinter : Printer {

    override val errorText: String = "선택된 메뉴가 없습니다."

    override fun print(argument: Any?) {
        val payData = argument as? PayData
        payData ?: return

        println("총 ${payData.allPrice.formatPlusWon()}이 결제되었습니다!")
        println("금고에 있는 총 잔고는 ${payData.amount.formatPlusWon()}입니다!")
    }

}