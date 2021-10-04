import option.*
import optionEnum.Options
import kotlin.random.Random

class POSMachine {

    fun run() {
        println("포스기 시작")
        selectOption()
    }

    private fun selectOption() {
        println("\n랜덤으로 작업을 시작합니다..")
        processRandom()
    }

    private fun processRandom() {
        val ordinal = Random.nextInt(Options.values().size)

        val option = Options.values()[ordinal]

        when(option) {
            Options.CALCULATE -> CalculateOption().process()
            Options.CASHUP -> CashUpOption().process()
            Options.ORDER -> OrderOption().process()
            else -> OffOption().process()
        }

        if (option != Options.OFF) {
            selectOption()
        }
    }

}