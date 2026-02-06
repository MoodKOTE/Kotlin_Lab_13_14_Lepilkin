# Лабораторная работа №13-14
Коллекции, обобщения и функциональный стиль в Kotlin
## Описание
Данная лабораторная работа посвящена изучению продвинутых возможностей языкаKotlin,которые активно используются при разработке Android-приложений.
В рамках работы рассматриваются:
- обобщённые типы (Generics);
- коллекции Kotlin;
- функции высшего порядка;
- extension-функции;
- enum классы;
- data классы;
- singleton объекты;
- интерфейсы;
- scope-функции.
  Все примеры ориентированы на практическое применение и подготовку к разработкемобильных приложений.
## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <URL_репозитория>
```
## Изученные темы и примеры
1. Generics (Обобщённые типы)
Изучение создания универсальных классов, работающих с разными типами данных.

```kotlin
class Question<T>(
val questionText: String,
val answer: T,
val difficulty: Difficulty
)
```
2. Enum классы
Создание перечислений для ограничения возможных значений и предотвращения ошибок.

```kotlin
enum class Difficulty {
EASY, MEDIUM, HARD
}
```
3. Data классы
Использование классов данных для автоматической генерации методов.

```kotlin
data class Question<T>(
val questionText: String,
val answer: T,
val difficulty: Difficulty
)
```
4. Singleton и Companion Object
Создание объектов в единственном экземпляре.

```kotlin
object StudentProgress {
var total: Int = 10
var answered: Int = 3
}

class Quiz {
companion object StudentProgress {
var total: Int = 10
var answered: Int = 3
    }
}
```
5. Extension-функции и свойства
Расширение функциональности существующих классов без наследования.

```kotlin
val Quiz.StudentProgress.progressText: String
get() = "${answered} из ${total} отвечено"

fun Quiz.StudentProgress.printProgressBar() {
repeat(Quiz.answered) { print("▓") }
repeat(Quiz.total - Quiz.answered) { print("▒") }
println()
println(progressText)
}
```
6. Интерфейсы
Определение контрактов для классов.

```kotlin
interface ProgressPrintable {
val progressText: String
fun printProgressBar()
}
```
7. Scope-функции
Использование функций для работы с объектами в определенном контексте.

```kotlin
question1.let {
println(it.questionText)
println(it.answer)
println(it.difficulty)
}

Quiz().apply {
printQuiz()
}
```
8. Коллекции: Массивы
Работа с базовыми массивами.

```kotlin
val solarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
println(solarSystem[0])
```
9. Коллекции: Списки
Использование неизменяемых и изменяемых списков.

```kotlin
val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
val mutableSystem = mutableListOf("Mercury", "Venus", "Earth")
mutableSystem.add("Mars")
```
10. Коллекции: Множества
Работа с коллекциями, гарантирующими уникальность элементов.

```kotlin
val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars")
solarSystem.add("Jupiter")
solarSystem.add("Earth") // Не добавится, так как уже существует
```
11. Коллекции: Ассоциативные массивы (Map)
Создание и работа с коллекциями ключ-значение.

```kotlin
val solarSystem = mutableMapOf(
"Mercury" to 0,
"Venus" to 0,
"Earth" to 1,
"Mars" to 2
)
println(solarSystem["Earth"]) // 1
```
12. Функции высшего порядка
Использование функций, принимающих или возвращающих другие функции.

```kotlin
fun displayMessage(mes: () -> Unit) {
mes()
}

fun action(x: Int, y: Int, op: (Int, Int) -> Int) {
val result = op(x, y)
println(result)
}
```
13. Функции высшего порядка для коллекций
Применение функций для обработки коллекций.

```kotlin
// forEach - перебор элементов
cookies.forEach {
println("${it.name} - $${it.price}")
}

// map - преобразование элементов
val fullMenu = cookies.map {
"${it.name} - $${it.price}"
}

// filter - фильтрация элементов
val softBakedMenu = cookies.filter {
it.softBaked
}

// groupBy - группировка элементов
val groupedMenu = cookies.groupBy { it.softBaked }

// fold - аккумуляция значений
val totalPrice = cookies.fold(0.0) { total, cookie ->
total + cookie.price
}

// sortedBy - сортировка элементов
val alphabeticalMenu = cookies.sortedBy { it.name }
```
14. Библиотечная система (самостоятельное задание)
Пример проектирования системы с использованием изученных концепций.

```kotlin
// Generic-класс
class Library<T> {
private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }
}

// Data-классы
data class Book(
val title: String,
val author: String,
val year: Int,
val isbn: String
)

// Sealed-класс
sealed class LibraryItem {
data class BookItem(val book: Book) : LibraryItem()
data class MagazineItem(val magazine: Magazine) : LibraryItem()
data class DVDItem(val dvd: DVD) : LibraryItem()
}

// Функции высшего порядка для библиотеки
fun filterByYear(items: List<LibraryItem>, year: Int): List<LibraryItem.BookItem> {
return items.filterIsInstance<LibraryItem.BookItem>()
.filter { it.book.year == year }
}
```
## Автор
Лепилкин Максим Александрович
## Лицензия
Проект создан в учебных целях.