import java.lang.Math.sqrt

var numero = 0


fun main() {
    do {
        print("Introduzca un número para hacer la raiz: ")
        numero = readln().toInt()

        if (numero <= 0) {
            println("El numero no puede ser 0 ni menor de 0")
        }
    } while (numero <= 0)

    print("La raíz cuadrada del número $numero es ${raiz()}")
}

fun raiz(): Double {
    var nuggetDePollo = 0.0

    if (numero > 0) {
        nuggetDePollo = sqrt(numero.toDouble())
    }

    return nuggetDePollo

}