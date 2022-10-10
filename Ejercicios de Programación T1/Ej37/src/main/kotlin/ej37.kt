fun main() {
    var intentos = 0
    var secreto = 0
    val NUM_MAX = 100
    val NUM_MIN = 1
    val IntentosMax = 5
    var num = 0


    do {
        do {
            secreto = numeroRandom(NUM_MIN, NUM_MAX)
            print("Introduzca un número entre 1 y 100: ")
            num = readln().toInt()
            if (num > NUM_MAX || num < NUM_MIN) {
                println("EL NUMERO TIENE QUE ESTAR ENTRE 1 Y 100")
            }
        } while (num > NUM_MAX || num < NUM_MIN)
        do {
            intentos = 0
            intentos = intentos + 1
            if (num == secreto) {
                print("POR FIN HACES ALGO BIEN TN TU VIDA!!! ADIVINASTE QUE EL NÚMERO ERA $secreto")
            }


        } while (intentos < IntentosMax || num != secreto)
    } while (continuar("¿Desea continuar jugando? s/n:"))

}

private fun numeroRandom(numMin: Int, numMax: Int): Int {
    val numMIN = 1
    val numMAX = 100
    return (numMin..numMax).random()
}

fun continuar(mensaje: String): Boolean {
    val respuesta: String = readln()
    return respuesta == "S" || respuesta == "s"
}