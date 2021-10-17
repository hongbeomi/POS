package printer

interface Printer {

    val errorText: String
    get() = "유효하지 않은 입력입니다\n"

    fun print(argument: Any? = null)

    fun error() {
        println(errorText)
    }

}