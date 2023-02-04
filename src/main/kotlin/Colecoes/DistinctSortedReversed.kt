package Colecoes


fun main() {

    val data = geraDados8()

    /*
    * Distinct: neste caso pegamos somente os valores distintos por ex [3,3,1] ele vai retornar [3,1]
    * Sorted: ordena a lista < para >
      SortedDescendig: ordena do maior para menor
    * Reversed: pegamos a lista e colocamos ela invertida
    */

    val listateste = listOf<Int>(3,10,3,10,50,60,30,100)

    println(listateste.distinct())
    println(listateste.sorted())
    println(listateste.sortedDescending())
    println(listateste.reversed())
    println(data.distinctBy { it.calorias })

}

fun geraDados10(): List<Receita>{
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
}


data class Receita10(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes10(val nome: String, val quantidade: Int)