package Exercicios


fun quadrado() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()


    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("é um quadrado.")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    println("Informe o lado 3: ")
    val lado3 = readLine()


    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && x == z && y == z) {
            println("é um triangulo equilatero.")
        } else {
            println("Não é um triangulo equilatero")
        }
    }
}

fun qualasaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira String")
        } else println("Segunda String")
    }
    println("Terceira String")
}

fun portaria() {
    println("Qual sua idade?: ")
    val idade = readLine()


    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado, Menores de idadade não são permitidos")
            return
        }
    }
    println("Qual é o tipode de convite?: ")
    var tipoconvite = readLine()

    if (tipoconvite != null && tipoconvite != "") {
        tipoconvite = tipoconvite.lowercase()
        if (tipoconvite == "comum" || tipoconvite == "premium" || tipoconvite == "luxo") {
            println("Convite ok")
        } else {
            println("Negado, convite invalido")
            return
        }
    }

    println("Qual o código do convite?: ")
    val codigoconvite = readLine()

    if (codigoconvite != null && codigoconvite != "") {
        codigoconvite.lowercase()
        if (tipoconvite == "comum" && codigoconvite.startsWith("xt")) {
            println("Bem-Vindo ao Evento!")
        } else if (tipoconvite == "premium" || tipoconvite == "luxo" && codigoconvite.startsWith("xl")) {
            println("Bem-Vindo ao Evento!")
        } else {
            println("Negado, Convite inválido")
            return
        }
    }


}

fun main() {

    // quadrado()
    // triangulo()
    // qualasaida(4)
    portaria()
}

