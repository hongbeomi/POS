package printer

class PayMenuPrinter {

    fun printCommand() {
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

    fun printError() {
        println("유효하지 않은 입력입니다\n")
    }

    fun printSelectedName(selectedName: String) {
        println("${selectedName}가(이) 선택되었습니다. 추가 선택을 완료해주세요")
    }

}