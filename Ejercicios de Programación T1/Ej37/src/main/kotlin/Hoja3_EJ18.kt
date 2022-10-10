fun main() {

    var X = 0
    var Y = 0
    var Z = 0

    print("introduce un número X: ")
    X = readln().toInt()
    print("introduce un número Y: ")
    Y= readln().toInt()
    print("introduce un número Z: ")
    Z= readln().toInt()


    if (X<Y && Y<Z) {
        print("están bien ordenados ")
    }else {
        print("no están bien ordenados ")
    }
}




