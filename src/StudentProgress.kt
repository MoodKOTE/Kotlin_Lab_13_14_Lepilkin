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
val Quiz.StudentProgress.progressText: String
    get() = "${answered} из ${total} отвечено"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(progressText)
}

fun main() {
    Quiz.printProgressBar()
}
