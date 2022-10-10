import kotlin.math.PI

var area = 0.0
var circunferencia = 0.0
var radio = 0.0


fun main() {
    do {
        print("Introduzca el radio de la circunferencia: ")
        radio = readln().toDouble()

        if (lado < 0) {
            println("El radio no puede ser menor de 0")
        }
    } while (lado < 0)
    println("El area de la  circunferencia de radio $radio es ${areaf()} ")
    println("La superficie de la  circunferencia de radio $radio es ${circunferenciaf()}")
}

fun areaf(): Double {
    area = PI * (radio * radio)
    return area

}

fun circunferenciaf(): Double {
    circunferencia = 2 * PI * radio
    return circunferencia

}