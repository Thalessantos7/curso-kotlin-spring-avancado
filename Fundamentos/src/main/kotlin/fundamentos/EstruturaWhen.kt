package fundamentos

fun main() {
    val x = 25

    when(x) {
        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("X é uma dezena.")
        }
        in 11 .. 15 -> println("X está entre 11 e 15.")
        !in 16 .. 20 -> println("O número não está no range de 16 a 20.")
        else -> println("Número não mapeado.")
    }

    println(comecaComOi("Oi, tudo bem?"))
    println(comecaComOi("tudo bem?"))
    println(comecaComOi(5))

    when {
        comecaComOi(5) -> println("5")
//        comecaComOi("Oi, tudo bem?") -> println("Oi, tudo bem?")
        comecaComOi("Oi, estou bem!") -> println("Oi, estou bem!")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("Oi")
        else -> false
    }
}