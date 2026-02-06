object StudentProgress {
    val total: Int = 10
    var answered: Int = 3
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz: ProgressPrintable{
    override val progressText: String
        get() = "${answered} из ${total} отвечено"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

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
    Quiz().printProgressBar()
}
