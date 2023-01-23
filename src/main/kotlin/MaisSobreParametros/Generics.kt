package MaisSobreParametros

fun main() {

    //IMPORTANTE: precisamos estar preparados para receber os valores genericos em nosso codigo
    println(mediageneric(30f, 50f, 60f, 90f, "valor", false))
}

// a variavel generica podemos usar ela para inserirmos todos os tipos de dados (string, int, boolean)

fun <T> mediageneric (vararg notas: T): Float {
    //para declaramos precisamos colocar no inicio da funcao <T> e no retorno T tbm pra que kotlin entenda
    var soma = 0f
    for (n in notas) {

        if (n is Float){
            soma += n
        }
        if (n is String){
            println("Possuimos uma string")
        }

        if (n is Boolean){
            println("Achamos um boleano aqui")
        }
    }
    return soma / notas.size
}

//quando uma funcao possuim um retorno normal e um outro parametro, o generico precisamos obrigatoriamente colocar o retorno generico (vararg) sempre no final
fun <T>  mediacomgeneric(idade: String, abc: Float, vararg notas: T): Float {

    var soma = 0f
    for (n in notas) {

        if (n is Float){
            soma += n
        }
        if (n is String){
            println("Possuimos uma string")
        }

        if (n is Boolean){
            println("Achamos um boleano aqui")
        }
    }
    return soma / notas.size
}

