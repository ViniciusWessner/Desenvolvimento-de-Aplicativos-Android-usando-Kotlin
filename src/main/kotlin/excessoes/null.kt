package excessoes

fun main() {

    val variavelnulla: String? = null
    //utilizamos o interrogração para quando o kotlin preicisa identificar se eh null ou nao
    println(variavelnulla?.length)

//podemos também utiizar o !!, assim falamos para o kotlin, "nao trate essa variavel, deixe cmg"
    println(variavelnulla!!.length)


}


