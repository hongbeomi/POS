package util

import java.io.FileReader
import java.io.FileWriter


fun String.readFile(): String {
    FileReader(this).use {
        return it.readText()
    }
}

fun String.writeFile(value: String) {
    FileWriter(this).use {
        return it.write(value)
    }
}