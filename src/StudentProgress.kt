object StudentProgress {
    val total: Int = 10
    var answered: Int = 3
}

class Quiz{
    val question1 = Question<String>(
        "Речка спятила с ума – По домам пошла сама. ___",
        "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "Снег бывает только зимой.",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "Сколько будет 2 + 2?",
        4,
        Difficulty.HARD
    )
    companion object StudentProgress{
        val total: Int = 10
        var answered: Int = 3
    }
}

fun main() {
    println("${Quiz.answered} из ${Quiz.total} отвечено.")
}
