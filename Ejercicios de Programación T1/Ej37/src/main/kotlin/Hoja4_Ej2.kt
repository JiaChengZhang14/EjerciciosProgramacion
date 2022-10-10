fun main() {
    var num1 = 0
    var num2 = 0
    var dividendo = 0
    var divisor = 0
    var cociente = 0
    var resto = 0

    do {
        print("Introduzca el primer número: ")
        num1 = readln().toInt()
        print("introduzca el segundo número: ")
        num2 = readln().toInt()

        if (num1 < num2) {
            println("el número 1 tiene que ser mayor que el número 2")
        }
    } while (num1 < num2)

    do {
        resto = num1 - num2
        cociente++
        divisor = num1

    } while (divisor >= resto)
    print("$resto, $cociente")
}
