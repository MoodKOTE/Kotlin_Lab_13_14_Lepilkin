fun displayMessage(mes: () -> Unit) {
    mes()
}

fun morning() {
    println("Доброе утро")
}

fun action(x: Int, y: Int, op: (Int, Int) -> Int) {
    val result = op(x, y)
    println(result)
}

fun sum(a: Int, b: Int) = a + b
fun multiply(a: Int, b: Int) = a * b
fun subtract(a: Int, b: Int) = a - b

// Шаг 18.2: Возвращение функции из функции
fun selectAction(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> ::sum
        2 -> ::multiply
        else -> ::subtract
    }
}

fun main() {
    val action1 = selectAction(1)
    println(action1(5, 3))

    val action2 = selectAction(2)
    println(action2(5, 3))
}
