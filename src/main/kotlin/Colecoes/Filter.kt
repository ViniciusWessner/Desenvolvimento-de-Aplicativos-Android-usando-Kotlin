package Colecoes

fun main() {

    val data = geraDados4()

    //conseguimos utilizar o filtro para verificar se conseguimos encontrar em nosso lista objetos do valor filtrado
    println("Buscando a receita lasanha:")
    println(data.filter { it.nome == "Lasanha" })

    println("Buscando receitas com valorias maiores que 700:")
    println(data.filter { it.calorias > 700 })

    println("Conseguimos tambem realizar os filtros utilizando o any")
    println(data.any {it.calorias > 500})

    println("Conseguimos tambem consultar quantas receitas possui")
    println(data.count{it.calorias > 700})


}

fun geraDados4(): List<Receita>{
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


data class Receita4(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes4(val nome: String, val quantidade: Int)