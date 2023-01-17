package Exercicios

fun main() {

    converteAnos(3)
    retornaquantidade("vinicius")
    cubo(3)
    milhaskm(110.0f)
    ex5("Banana")

}

fun converteAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("$anos anos equivalem a ${anos * 12} meses")
    println("$anos anos equivalem a ${anos * 365} dias")
    println("$anos anos equivalem a ${anos * 365 * 24} horas $")
    println("$anos anos equivalem a ${anos * 365 * 24 * 60} minutos")
    println("$anos anos equivalem a ${anos * 365 * 24 * 60 * 60} segundos")
}

fun retornaquantidade(palavra: String) {

    println(palavra.length)

}

fun cubo(n: Int): Int{
    return n * n * n
}

fun milhaskm(milhas: Float): Float{
    return milhas * 1.6f
}


fun ex5(str: String) {
    println( str.replace("A", "x").replace("a", "x").lowercase())
}