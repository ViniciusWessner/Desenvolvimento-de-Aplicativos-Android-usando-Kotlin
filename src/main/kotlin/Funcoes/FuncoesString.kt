package Funcoes

fun main() {
    val str = "Programacao em Kotlin"
    val trim = "   meu nome es   "

    println("quantidade de caracteres: ${str.length}")
    println("Posicao zero da string: ${str[0]}") //p
    println(str.startsWith("Pro")) //verdadeiro
    println(str.endsWith("abc")) //falso

    //Estou buscando as duas letras na posicao 3 a 6 da variavel str (
    println(str.substring(2,6))

    //nesse caso estou substituindo da frase a palavra kotlin pela frase abaixo
    println(str.replace("Kotlin", "kotlin muito bom"))

    //tudo em maiusculo
    println(str.uppercase())

    //tudo em minusculo
    println(str.lowercase())

    //remove os espaços em branco no final e inicio da variavel (otima para formulario)
    println(trim.trim())
}