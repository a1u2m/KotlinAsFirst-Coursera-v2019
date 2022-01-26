@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr
import lesson3.task1.fibSequenceDigit
import kotlin.math.abs

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {

    var temp = number
    var first = 0
    var second = 0
    var third = 0
    var fourth = 0

    first = temp % 10
    temp /= 10
    second = temp % 10
    temp /= 10
    third = temp % 10
    temp /= 10
    fourth = temp % 10

    return first + second == third + fourth
}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean =
    (abs(x1 - x2) == abs(y1 - y2)) || (x1 == x2) || (y1 == y2)


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {

    val jan = 31
    val feb = 28
    val febLeap = 29
    val mar = 31
    val apr = 30
    val may = 31
    val jun = 30
    val jul = 31
    val aug = 31
    val sep = 30
    val oct = 31
    val nov = 30
    val dec = 31

    val leapYears = arrayOf(100, 200, 300, 500, 600, 700, 900, 1000, 1100, 1300, 1400, 1500, 1700, 1800, 1900)

    if ((year % 4 == 0) && (year !in leapYears)) {

        when (month) {
            1 -> return jan
            2 -> return febLeap
            3 -> return mar
            4 -> return apr
            5 -> return may
            6 -> return jun
            7 -> return jul
            8 -> return aug
            9 -> return sep
            10 -> return oct
            11 -> return nov
            12 -> return dec
        }
    } else {
        when (month) {
            1 -> return jan
            2 -> return feb
            3 -> return mar
            4 -> return apr
            5 -> return may
            6 -> return jun
            7 -> return jul
            8 -> return aug
            9 -> return sep
            10 -> return oct
            11 -> return nov
            12 -> return dec
        }
    }
    return 0
}

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean = TODO()

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = TODO()
