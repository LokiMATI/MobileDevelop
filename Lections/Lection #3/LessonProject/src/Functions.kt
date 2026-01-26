/*
fun name(parm1:Int, parm2:String = "Hello", param3:Int) : Int {
    Тело функции
    return
}

Unit - аналог void в C#, используется в качестве возвращаемого,
для функции, не возвращающих значение
 */

fun hello() {
    println("Hello")
}

fun name(parm1:Int, parm2:String = "Hello", param3:Int) : Int {
    return 1
}

fun printLines(vararg lines:String) {
    for (line in lines) {
        println(line)
    }
}

fun compareAge(age1:Int, age2:Int) {
    fun isAgeValid(age:Int):Boolean {
        return age > 0 && age < 150
    }

    if (isAgeValid(age1) && isAgeValid(age2)) {
        return
    }
}

fun square(n:Int) = n*n

fun displayMessage(mes:()->Unit) {
    mes()
}

fun morning() = println("Доброе утро")

fun action(a:Int, b:Int, op:(Int, Int)->Int) {
    val result = op(a,b)
    println(result)
}

fun sum(a:Int, b:Int) : Int {
    return a+b
}

fun sub(a:Int, b:Int) : Int {
    return a-b
}

fun main() {
    hello()
    hello()

    var h = ::hello
    h()
    h()

    name(1, param3 = 7)

    val anon = fun(x:Int) = x * x

    var lambda = { println() }
    var lambda1 = { x:Int -> println() }

    displayMessage(::morning)
    displayMessage({ println("Добрый вечер") } )
    // Хвостовая лямбда - trailing Lambda
    displayMessage { println("Добрый день") } //вохможно только если параметр0функция идёт последним

    action(5, 2, ::sum)
    action(5, 2, ::sub)
}
