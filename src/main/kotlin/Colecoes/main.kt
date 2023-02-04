package ClasseAnonima.Colecoes

fun main() {
    //list off,nao conseguimos alterar ela ou modificar
    val lista1 = listOf(12, 10, 9, 8, 9, 4)

    // conseguimos modificar ela, é uma lista que conseguimos alterar
   val lista2 = mutableListOf(1,50,30,45,90,)


    println(lista2[0])
    println(lista2.size)
    println(lista2)
    println("--- Adicionando um valor ----")
    lista2.add(40)
    println(lista2)
    println("--- removendo um valor ----")
    lista2.remove(1)
    println(lista2)
    println("--- removendo que esta na primeira possicao ----")
    lista2.removeAt(0)
    println(lista2)

    println("--- verificando se contem o valor 45 ----")
    println( lista2.contains(45))









}