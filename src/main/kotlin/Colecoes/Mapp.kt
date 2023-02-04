package Colecoes


fun main() {

    val data = geraDados8()

    /*
    * Map: Realiza uma transformação mudando a estrutura
    */

    //nesse caso mapeando os nomes das receitas e inserindo todos os valores em uma array
    println(data.map { it.nome })

    //nesse caso aqui conseguimos pegar todas as calorias, colocar em um arraz e soma-las
    println(data.map { it.calorias }.sum())


}

fun geraDados8(): List<Receita>{
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


data class Receita8(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes8(val nome: String, val quantidade: Int)