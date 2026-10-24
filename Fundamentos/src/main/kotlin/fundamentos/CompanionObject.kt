package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Thales", "Rua Teste", 19)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Thales", "Rua Teste", 19)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValoresPadrao()
    var minhaCLoader = MinhaClasse.criarComValoresPadrao()
    var minhaCLoader2 = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}