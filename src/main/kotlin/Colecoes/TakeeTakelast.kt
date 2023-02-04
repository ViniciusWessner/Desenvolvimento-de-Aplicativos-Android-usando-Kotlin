package Colecoes


fun main() {

    val data = geraDados5()

    //com o take conseguimos pegar N elementos de uma lista, conforme exemplo abaixo

    //pegando os tres primeiros elementos de uma lista
    var doisprimeiros = data.take(3)

    //pegando o ultimo elemento de uma lista, podemos colocar informar o N = 2 para pegarmos os ultimos dois valores
    var ultimasreceotas = data.takeLast(1)
    println("os dois primeiros elementos da lista são: $doisprimeiros")
    println("os dois primeiros elementos da lista são: $ultimasreceotas")


}

fun geraDados5(): List<Receita>{
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


data class Receita5(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes5(val nome: String, val quantidade: Int)