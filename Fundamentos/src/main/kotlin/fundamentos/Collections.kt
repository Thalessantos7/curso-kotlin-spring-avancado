package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 6)
    var listaMultavel = mutableListOf(1, 2, 4, 6, 3, 20, 15)
    var listaNomes = mutableListOf("Gustavo", "Daniel")
    var setNumeros = setOf(1, 2, 3, 2)
    var setNumerosMultavel = mutableSetOf(1, 2, 3, 2)
    var mapNomeIdade = mapOf("Gustavo" to 24, "Daniel" to 20)
    var mapNomeIdadeMultavel = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    val pares = lista.filter { it % 2 == 0 }

    println(pares)

    for (numero in lista) println(numero)

    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    println(listaMultavel)

    listaMultavel.add(8)
    listaMultavel.removeAt(0)
    listaMultavel.remove(3)
    listaMultavel[0] = 20

    println(listaMultavel)

    listaMultavel.sort()
    println(listaMultavel)

    listaMultavel.shuffle()
    println(listaMultavel)

    println(listaNomes)

    listaNomes.sort()
    println(listaNomes)

    println(setNumeros)

    println(setNumerosMultavel.contains(2))

    println(mapNomeIdade)

    mapNomeIdadeMultavel.put("Bruno", 30)
    mapNomeIdadeMultavel["Bruno"] = 30
    println(mapNomeIdadeMultavel)

    mapNomeIdadeMultavel.remove("Bruno")
    println(mapNomeIdadeMultavel)

    mapNomeIdadeMultavel["Gustavo"] = 30
    println(mapNomeIdadeMultavel)

    mapNomeIdadeMultavel.putIfAbsent("Bruno", 24)
    println(mapNomeIdadeMultavel)
}