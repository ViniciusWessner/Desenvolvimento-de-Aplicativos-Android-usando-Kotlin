package Colecoes

fun main() {

    val data = geraDados()


    /*
       ANY: O any basicamente pergunta para nosso codigo se tem valores e objetos dentro da lista, e ele retornará para a gente true e false
       COUNT: O count é responsável por contar a quantidade de elemtos que possuimos
     */

    println("Tenho dados? ${if (data.any()) "Sim" else "Não"}")
    println("tenho elementos? ${data.count()} elementos")
}

fun geraDados(): List<Receita>{
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


data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)