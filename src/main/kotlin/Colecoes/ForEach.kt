package Colecoes


fun main() {

    val data = geraDados6()

    /*
        ForEach significa "parar cada" sem importar a quantidade
    */

    // desta forma estamos falando para o kotlin "para cada item da minha lista imprima para mim o nome"
    data.forEach { println(it.nome) }

    //nome das receitas que possuem mais de 500cal, combinando duas funcoes em somente um item
    println("nome das receitas que possuem mais de 500cal:")
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }


}

fun geraDados6(): List<Receita>{
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


data class Receita6(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes6(val nome: String, val quantidade: Int)