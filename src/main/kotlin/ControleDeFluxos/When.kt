package ControleDeFluxos

fun bonus1(cargo: String): Float {

    var bonus = 0f

    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus
}

fun bonuswhen(cargo: String): Float{

    return when(cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro" ->  1000f
        "Estagiario" -> 500f
        else -> 0f
    }

}


fun main() {

    val n = 10
    when(n){
        in 1..10 -> println("1..10")
    }
}