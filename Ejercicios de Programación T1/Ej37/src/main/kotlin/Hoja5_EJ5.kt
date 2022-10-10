fun main() {
    var resultC: Double = 0.0
    var resultF: Double = 0.0
    var num = 0
    /*
        do {
            num = readln().toInt()
            resultF = ((9 / 5 * num) + 32)
            println("$num grados Celsius son $resultF grados farenheit")

        } while (eleccion("Quiere cambiar a Farenheit o a Celsius? C/F:  "))
    */
    if (eleccion("Quiere cambiar a Farenheit o a Celsius? C/F:  ")) {
        print("Introduza los grados celsius que quiere cambiar a Farenheit: ")
        num = readln().toInt()
        resultF = ((9 / 5 * num) + 32).toDouble()
        println("$num grados Celsius son $resultF grados farenheit")

    } else {
        print("Introduza los grados Farenheit que quiere cambiar a Celsius: ")
        num = readln().toInt()
        resultC = (num - 32) / 1.8
        println("$num grados Farenheit son $resultC grados Celsius")
    }

}


fun eleccion(mensaje: String): Boolean {
    do {
        print(mensaje)
        var respuesta = readln()
        when (respuesta) {
            "F", "f" -> return true
            "C", "c" -> return false
        }
    } while (true)
}





