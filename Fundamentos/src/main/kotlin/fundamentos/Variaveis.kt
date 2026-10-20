package fundamentos

fun main() {
    var nome = "Thales"
    val nomeVal = "Thales"

    nome = "Daniel"
//    nomeVal = "Daniel"

    var idade = 18
    println(idade)

    val teste: String
    teste = "Teste"

    var texto = "Texto"
}

class Variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}