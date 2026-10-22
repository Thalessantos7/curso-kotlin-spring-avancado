package fundamentos

fun main() {
    println("Primeiro for:")
    printa1A10()

    println("\nSegundo for:")
    printa10A1()

    println("\nTerceiro for: ")
    printaPar1A10()

    println("\nQuarto for:")
    printaRange(10, 20)

    println("\nPrimeiro while:")
    whileMenorQue10()

    println("\nPrimeiro doWhile:")
    doWhileMenorQue10()
}

fun whileMenorQue10() {
    var x = 0

    while (x < 10) {
        println(x)

        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0

    do {
        println(x)

        x++
    } while (x < 10)
}

fun printa1A10() {
    for (numero in 1 .. 10) println(numero)
}

fun printa10A1() {
    for (numero in 10 downTo 1) println(numero)
}

fun printaPar1A10() {
    for (numero in 2 .. 10 step 2) println(numero)
}

fun printaRange(inicio: Int, fim: Int) {
    for (numero in inicio .. fim) println(numero)
}