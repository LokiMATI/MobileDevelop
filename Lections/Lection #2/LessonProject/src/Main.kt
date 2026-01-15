// Учебный проект

/*
Даная леция была записана
14.01.2026
 */

fun main() {
    println("Hello, World!")
    println("Hello, World!")

    //Целочисленные
    var b : Byte //-128~127
    var s : Short //-32768~32767
    var n : Int = 1 //-2млрд~2млрд
    var l : Long // -9*10^18~9*10^18

    var ui : UInt = 1U
    var nb = 0b0011
    var nh = 0xff

    //Вещественные
    var f : Float = 3.14F
    var d : Double = 3.34e-3 // 3.14 * 10^-3

    //Логический
    var isTrue : Boolean = true
    var isFalse : Boolean = false

    //Символьные
    var c : Char = 'A'
    var str : String = "Hello, World!"
    var longText = """
        Много
        много
        строк
    """.trimIndent()

    var x = 15
    var y = 5

    var result = "$x + $y = ${x + y}"

    var format = String.format("%.2f %d", f, n)

    //Преобразование типов
    f = d.toFloat()

    var obj : Any

    //Диапазоны
    val range = 1..5 step 2
    var range1 = 1..<5
    var range2 = 1 until 5
    var range3 = 5 downTo 1

    println(range.toList())

    var data = readln()
    println(data)
}