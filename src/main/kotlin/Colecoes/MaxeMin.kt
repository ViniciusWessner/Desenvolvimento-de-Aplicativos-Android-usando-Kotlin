package Colecoes


fun main() {

    val data = geraDados7()

    /*
          o max funciona da mesma forma que o sum, ele precisa ser INT ou FLOAT pra funfar
    MAX: maximo valor de uma lista
    MIN: minimo valor de uma lista
    MAXOF: com esse argumento conseguimos buscar o "maximo de" alguma lista
    MINOF e com esse argumento conseguimos buscar o "minimo de" alguma lista

     */

    //nesse caso aqui o maxof vai apenas me trazer o retorno em numeros das calorias
    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    //a diferença usando o maxbyornull é que conseguimos obter um resultado muito diferente usando essa funcao
    println(data.maxByOrNull { it.calorias })

}

fun geraDados7(): List<Receita>{
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


data class Receita7(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes7(val nome: String, val quantidade: Int)