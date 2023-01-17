package Funcoes

fun main() {
    HelloWord()

    val somadosdois = soma(30,15)
    println("a somada dos dois valores e igual a: $somadosdois")
    println("funcao simplificada o total de  ${sum(2,3)}")

    val totaldivisao = divisao(20f,2.5f)
    println("o valor total da divisao em duas linhas: $totaldivisao")
    println("usando a divisao na mesma linha ${divisao2(12.5f,6.2f)}")
}


//Funcao de unica linha
fun sum (c: Int, d:Int): Int = (c+d)


fun soma(a: Int, b:Int): Int{
    return (a+b)

}

fun HelloWord() {
    println("Ola, Mundo")
}

//funcao divisao usando duas linhas
fun divisao(a: Float, b:Float):Float{
    return a/b
}

//mesma funcao porem esta somente em uma linha
fun divisao2(c: Float,d: Float):Float = c/d
