fun main () {
    var contador = 1
    var suma = 0
    var n = 0

    print("Introduzca el número de números que quieres sumar: ")
    n= readln().toInt()

    do {
        suma = suma + contador
        contador++
    } while (contador <= n)
    print("El resultado de la suma de los primeros $n número es $suma ")
}