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

    cumpleañosPa()
    cumpleañosJuanito()

    problemasPracticos()
}
fun cumpleañosPa() {
    print("Felices 52, pa!")
    println("")

}
fun cumpleañosJuanito(): String {
    val nombreCumpleaniero = "Happy Birthday, JuanitoClunny"
    val edadCumpleaniero = "You are 15 years old"
    println("$nombreCumpleaniero\n$edadCumpleaniero")
    return "$nombreCumpleaniero\n$edadCumpleaniero"
}
fun problemasPracticos() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    println("Nuevo mensaje de mi amigo")

    var porcentajeDesc: Int = 0
    var oferta: String = ""
    var objeto = "Google Chromecast"
    porcentajeDesc = 20
    oferta = "Oferta - Mas de $porcentajeDesc porciento de descuento en $objeto"
    println(oferta)


}
