var num = 0

fun main() {
    do {
        print("Introduzca un número: ")
        num = readln().toInt()

        if (num == 0) {
            println("EL número no puede ser 0")
        }
    } while (num == 0)

    print("${positivo()}||${negativo()}")
}


fun positivo() {
    if (num > 0) {
        return print("EL número $num es positivo.  ")
    }
}

fun negativo() {
    if (num < 0) {
        return print("EL número $num es negativo.  ")
    }
}