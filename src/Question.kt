class FillInBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>(
        "Речка спятила с ума – По домам пошла сама. ___",
        "водопровод",
        "medium"
    )
    val question2 = Question<Boolean>(
        "Снег бывает только зимой.",
        false,
        "easy"
    )
    val question3 = Question<Int>(
        "Сколько будет 2 + 2?",
        4,
        "easy"
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}