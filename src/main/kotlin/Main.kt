import java.text.DateFormat
import java.time.format.DateTimeFormatterBuilder
import java.util.*

fun main() {
    println(publishedAgo(52))
    println(publishedAgo(82))
    println(publishedAgo(240))
    println(publishedAgo(241))
    println(publishedAgo(682))
}

fun publishedAgo(itemTime: Long): String {
    if (itemTime in 60..119L) return "${itemTime / 60 } минуту назад"
    if (itemTime in 120L..299L) return "${itemTime / 60 } минуты назад"
    if (itemTime in 300L..1_259L) return "${itemTime / 60 } минут назад"

    if (itemTime in 1_260L..1_319L) return "${itemTime / 60 } минуту назад"
    if (itemTime in 1_320L..1_499L) return "${itemTime / 60 } минуты назад"
    if (itemTime in 1_500L..1859L) return "${itemTime / 60 } минут назад"

    if (itemTime in 1860L..1919L) return "${itemTime / 60 } минуту назад"
    if (itemTime in 1920L..2099L) return "${itemTime / 60 } минуты назад"
    if (itemTime in 2100L..2459L) return "${itemTime / 60 } минут назад"

    if (itemTime in 2_460L..2519L) return "${itemTime / 60 } минуту назад"
    if (itemTime in 2_520L..2699L) return "${itemTime / 60 } минуты назад"
    if (itemTime in 2_700L..3059L) return "${itemTime / 60 } минут назад"

    if (itemTime in 3_060L..3119L) return "${itemTime / 60 } минуту назад"
    if (itemTime in 3_120L..3299L) return "${itemTime / 60 } минуты назад"
    if (itemTime in 3_300L..3599L) return "${itemTime / 60 } минут назад"

    if (itemTime  in 3_600L..7_199L) return "${itemTime / 60 } час назад"
    if (itemTime  in 7_200L..17_999L) return "${itemTime / 60 } часа назад"
    if (itemTime  in 18_000L..75_599L) return "${itemTime / 60 } часов назад"

    if (itemTime  in 76_000L..86_399L) return "несколько часов назад"

    if (itemTime  in 86_400L..172_799L) return "${itemTime / 60 } день назад"
    if (itemTime  in 172_800L..604_799L) return "несколько дней назад"

    if (itemTime  in 604_800L..1_209_599L) return "неделю назад"


    if (itemTime  >= 1_209_600L) return "Слишком много времени уже прошло"


    return "Меньше минуты назад";
}