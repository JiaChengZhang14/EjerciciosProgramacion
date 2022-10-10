fun main() {
    var intentosMax = 5
    var numMin = 1
    var numMax = 100
    var partidaTerminada = false
    while (partidaTerminada == false) {
        //inicia una partida
        var currentAttempt = 0
        val numRandom = (numMin..numMax).random()
        print("introduzca un número: ")
        var input = readln().toInt()

        if (input == numRandom) {
            print("Has ganado")
        } else {
            print("otro intento más!")
            input = readln().toInt()

        }
        currentAttempt++
    }
}


private fun numeroRandom(numMin: Int, numMax: Int): Int {
    return (numMin..numMax).random()
}

fun askForKeepPlaying(mensaje: String): Boolean {
    print(mensaje)
    var respuesta = readln().lowercase()
    return respuesta == "s"
}


/*
{
    val intentosMaximos = 5
    var juegoTerminado = false
    val numMIN = 1
    val numMAX = 100

    println("Inicia el juego")

    while (!juegoTerminado) {
        // inicia una partida
        val numRandom = numeroRandom(numMIN, numMAX)

        var adivinado = false
        var intentoActual = 0
        while (!adivinado && intentoActual < intentosMaximos) {
            // inicia un intento
            print("Introduce un num: ")
            val input = readln().toInt()
            if (input == numRandom) {
                adivinado = true
                println("Ganaste!!")
            } else {
                if (input > numRandom) {
                    println("El numero que has puesto es demasiado grande")
                } else {
                    println("El numero que has puesto es demasiado pequeño")
                }
                println("Intentalo otra vez!")
            }

            intentoActual++
        }

        if (adivinado) {
            println("Has ganado en $intentoActual intentos.")
        } else {
            println("No conseguiste adivinarlo en $intentosMaximos intentos.")
        }

        // termina la partida

        var continuar = askForKeepPlaying("Quieres continuar? [S/n] ")
        juegoTerminado = continuar == false
    }
}
 */