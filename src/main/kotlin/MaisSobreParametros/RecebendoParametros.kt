package MaisSobreParametros

fun main() {

    println(media(30f, 50f, 60f, 90f))
}


fun media (vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return soma / notas.size
}