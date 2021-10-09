package menu

class OrderMenuSelector {

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            println(
                """
                    
                - 음식을 주문합니다 -
                주문할 음식을 선택해주세요!
                1. 피자
                2. 커피
                3. 치킨
                4. 햄버거
                5. 선택 완료
            """.trimIndent()
            )
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal == 5 -> break
                ordinal == null || ordinal - 1 !in 0 until Menu.values().size -> {
                    println("유효하지 않은 입력입니다\n")
                    continue
                }
                else -> {
                    val menu = Menu.values()[ordinal - 1]
                    println("${menu.nameKR}가(이) 주문되었습니다. 추가 주문을 완료해주세요")
                    menuList.add(menu)
                }
            }
        }
        return menuList
    }

}