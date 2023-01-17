package ControleDeFluxos


fun ex3(){

}

fun main() {

}


fun ex1(cargo: String): Float {

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
fun ex2(cargo: String, experiencia: Int): Float {

    var bonus = 0f

    if (cargo == "Gerente") {
        bonus = if (experiencia < 2) {
            2000f
        } else {
            3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus
}
