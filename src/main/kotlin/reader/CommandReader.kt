package reader

class CommandReader {

    fun readInt(
        correctCondition: (Int) -> Boolean,
        onSuccess: (Int) -> Unit,
        onFailure: () -> Unit
    ) {
        val command = readLine()?.toIntOrNull()
        if (command != null && correctCondition.invoke(command)) {
            onSuccess.invoke(command)
        } else {
            onFailure.invoke()
        }

    }

}