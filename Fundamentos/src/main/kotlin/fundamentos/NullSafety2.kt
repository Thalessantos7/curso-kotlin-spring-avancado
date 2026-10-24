package fundamentos

fun main() {
//    val pessoa : Pessoa? = null
    val pessoa : Pessoa? = Pessoa("Gustavo", 24)

    println(pessoa!!.nome)
    println("Final do código")
}