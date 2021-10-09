package util

import java.text.NumberFormat

fun Int?.formatPlusWon(): String = this?.let {
    NumberFormat.getInstance().format(it) + "원"
} ?: ""