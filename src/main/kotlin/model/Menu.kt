package model

enum class Menu(val nameKR: String, val price: Int) {

    PIZZA("피자", 15000),
    COFFEE("커피", 6000),
    CHICKEN("치킨", 16000),
    BURGER("버거", 7000);

    companion object {
        fun isCorrectedSelect(ordinal: Int): Boolean {
            return ordinal in 0 until values().size
        }
    }

}