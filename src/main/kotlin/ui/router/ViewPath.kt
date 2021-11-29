package ui.router

import command.Command

enum class ViewPath {
    PAY,
    CASH_UP,
    EXIT;

    companion object {
        fun isCorrectedPath (ordinal: Int): Boolean {
            return ordinal in 0 until Command.values().size
        }
    }

}