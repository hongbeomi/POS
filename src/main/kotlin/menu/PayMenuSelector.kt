package menu

class PayMenuSelector {

    fun select(): MutableList<Menu> {
        val menuList = mutableListOf<Menu>()

        while (true) {
            println(
                """
                
                - 음식을 계산합니다 -
                드셨던 음식들을 선택해주세요!
                1. 피자
                2. 커피
                3. 치킨
                4. 햄버거
                5. 선택완료
            """.trimIndent()
            )
            val ordinal = readLine()?.toIntOrNull()

            when {
                ordinal == 5 -> break
                ordinal == null || (ordinal - 1) !in 0 until Menu.values().size -> {
                    println("유효하지 않은 입력입니다\n")
                    continue
                }
                else -> {
                    val menu = Menu.values()[ordinal - 1]
                    println("${menu.nameKR}가(이) 선택되었습니다. 추가 선택을 완료해주세요")
                    menuList.add(menu)
                }
            }
        }
        return  menuList
    }

}