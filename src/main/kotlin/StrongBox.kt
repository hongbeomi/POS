
object StrongBox {

    var amount = 0
        private set

    fun plusAmount(money: Int): Int {
        amount += money
        return amount
    }

    fun minusAmount(money: Int): Int {
        amount -= money
        return amount
    }

}