package printer

class OrderMenuPrinter: MenuPrinter() {

    override fun printMenu() {
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
    }

    override fun print(argument: Any?) {
        val selectedName = argument as? String
        selectedName ?: return

        println("${selectedName}가(이) 주문되었습니다. 추가 주문을 완료해주세요")
    }

}