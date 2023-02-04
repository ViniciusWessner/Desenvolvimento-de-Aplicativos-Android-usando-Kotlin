package Colecoes

fun main() {

    val data = geraDados1()

    /*
        First: First retorna o primeiro elemento
        Last: Last retorna o ultimo elemento
     */

    var primeiraReceita = data.first().nome
    var ultimaReceita = data.last().nome
    println("Primeira Receita: $primeiraReceita")
    println("Ultima Receita: $ultimaReceita")

}

fun geraDados1(): List<Receita>{
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


data class Receita1(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes1(val nome: String, val quantidade: Int)