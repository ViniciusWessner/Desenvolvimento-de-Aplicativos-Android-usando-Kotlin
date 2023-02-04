package Colecoes

fun main() {

    //chave -> valor

    /*

        Com o map basicamnete definimos uma chave para cada valor (chave -> valor)

    * */

    val map1 = mapOf<String, String>(Pair("Franca", "paris"), Pair("Alemanha", "Berlin"), Pair("Brasil", "Rio de Janeiro"))
    val map2 = mutableMapOf<String, String>(Pair("Franca", "paris"), Pair("Alemanha", "Berlin"))

    println(map1)
    println(map1.entries)
    println(map1.values)

    println("----- Tratando map 2 ------")
    map2["Brasil"] = "São Paulo"
    println(map2)
    map2.remove("Franca")
    println(map2)
    map2.contains("Brasil")
}