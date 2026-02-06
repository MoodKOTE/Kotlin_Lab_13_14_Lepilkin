val rockPlanets = arrayOf<String>("Mercury",
    "Venus", "Earth", "Mars")
val gasPlanets = arrayOf("Jupiter", "Saturn",
    "Uranus", "Neptune")
val solarSystem = rockPlanets + gasPlanets

val newSolarSystem = arrayOf(
    "Mercury",
    "Venus",
    "Earth",
    "Mars",
    "Jupiter",
    "Saturn",
    "Uranus",
    "Neptune",
    "Pluto",
)

fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14)
    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem["Pluto"])
    println(solarSystem["Theia"])
    solarSystem.remove("Pluto")
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
//    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    solarSystem.add("Pluto")
//    println(solarSystem.contains("Pluto"))
//    println("Pluto" in solarSystem)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))
//    solarSystem.add("Pluto")
//    solarSystem.add(3, "Theia")
//    solarSystem[3] = "Future Moon"
//    solarSystem.removeAt(9)
//    println(solarSystem.contains("Pluto"))
//    solarSystem.remove("Future Moon")
//    println("Pluto" in solarSystem)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//
//    for (planet in solarSystem){
//        println(planet)
//    }
}