package printer

class PayMenuPrinter: MenuPrinter() {

    override fun printMenu() {
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
    }

    override fun print(argument: Any?) {
        val selectedName = argument as? String
        selectedName ?: return

        println("${selectedName}가(이) 선택되었습니다. 추가 선택을 완료해주세요")
    }

}