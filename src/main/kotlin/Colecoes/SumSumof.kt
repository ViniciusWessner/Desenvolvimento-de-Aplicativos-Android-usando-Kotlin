package Colecoes


//sum: ele é responsável para somar, obrigatorios numeros,
//sumof: soma de uma propriedade especifica (it) conseguimos fazer uma soma de apenas um atributo do objeto

fun main() {
    val data = geraDados3()

    listOf<Int>(1,5,6,9).sum()
    val calorias = data.sumOf { it.calorias }
    println(calorias)

}

fun geraDados3(): List<Receita>{
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


data class Receita3(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes3(val nome: String, val quantidade: Int)