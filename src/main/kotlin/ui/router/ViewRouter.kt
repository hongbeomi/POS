package ui.router

import ui.view.CashUpView
import ui.view.ExitView
import ui.view.PayView

class ViewRouter {

    fun route(ordinal: Int) {
        val view = when(ordinal) {
            ViewPath.PAY.ordinal -> PayView()
            ViewPath.CASH_UP.ordinal -> CashUpView()
            ViewPath.EXIT.ordinal -> ExitView()
            else -> return
        }
        view.show()
    }

}