package Colecoes


fun main() {

    val data = geraDados8()

    /*
    * Average: Média dos valores
    */

    //utilizamos o average para pegar a media dos valores de uma lits de numeros
    listOf<Int>(3,5,9,7,10).average()

    //aqui estamos pegando a média da caloria de toadas as receitas
    data.map { it.calorias }.average()

}

fun geraDados9(): List<Receita>{
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


data class Receita9(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes9(val nome: String, val quantidade: Int)