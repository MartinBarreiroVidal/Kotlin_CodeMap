fun main() {
    println("Hello, Android!")
    println("Hello, Martín Barreiro!")

    println("1")
    println("2")
    println("3")

    println("I'm")
    println("learning")
    println("Kotlin!")

    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")


    val cont: Int = 10
    println("You have $cont unread messages.")

    val numFotos = 100
    val fotosBorradas = 10
    println("$numFotos fotos.")
    println("$fotosBorradas fotos borradas.")
    println("${numFotos - fotosBorradas} fotos restantes.")


    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")

    //incremento de valor
    var count = 10
    println("You have $count unread messages.")
    count = count + 1

    //double
    val viaje1: Double = 3.20
    val viaje2: Double = 4.10
    val viaje3: Double = 1.72
    val duracionTotalViaje: Double = viaje1 + viaje2 + viaje3
    println("$duracionTotalViaje kilómetros para llegar a tu destino.")

    val proximaReunion = "Proxima Reunion: "
    val fecha = "1 de enero"
    val recordatorio = proximaReunion + fecha + " de 2027."
    println(recordatorio)

    println("Hola \"que tal\"")

    //boolean
    val activarNotisT: Boolean = true
    println(activarNotisT)

    val activarNotisF: Boolean = false
    println(activarNotisF)


}