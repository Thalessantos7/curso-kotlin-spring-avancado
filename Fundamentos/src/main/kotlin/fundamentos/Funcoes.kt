package fundamentos

fun main() {
    dizOi(retornaNome(), 18)
    dizOi(idade = 18, nome = "Thales")
    dizOi("Thales")
}

fun retornaNome(): String {
    return "Thales"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}