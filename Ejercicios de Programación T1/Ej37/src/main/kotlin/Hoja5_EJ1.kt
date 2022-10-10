var perimetro = 0.0
var superficie = 0.0
var lado = 0.0


fun main() {
    do {
        print("Introduzca el lado del cuadrado: ")
        lado = readln().toDouble()

        if (lado < 0) {
            println("El lado no puede ser menor de 0")
        }
    } while (lado < 0)
    println("El perimetro del cuadrado de lado $lado es ${peri()} ")
    println("La superficie del cuadrado de lado $lado es ${surface()}")

}

fun peri(): Double {
    perimetro = lado * lado
    return perimetro


}

fun surface(): Double {
    superficie = lado * 4
    return superficie

}