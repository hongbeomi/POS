package strong_box

import util.readFile
import util.writeFile
import kotlin.math.max

object StrongBox {

    private const val PATH_AMOUNT = "src/amount"

    fun currentAmount(): Int {
        return PATH_AMOUNT.readFile().toInt()
    }

    fun plusAmount(money: Int): Int {
        val calculatedAmount = currentAmount() + money
        PATH_AMOUNT.writeFile(calculatedAmount.toString())

        return currentAmount()
    }

    fun minusAmount(money: Int): Int {
        val calculatedAmount = max(currentAmount() - money, 0)
        PATH_AMOUNT.writeFile(calculatedAmount.toString())

        return currentAmount()
    }

}