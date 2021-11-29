package processor

import strong_box.StrongBox

class CashUpProcessor(
    private val strongBox: StrongBox = StrongBox
) : Processor<Int> {

    override fun process(): Int {
        return strongBox.currentAmount()
    }

}