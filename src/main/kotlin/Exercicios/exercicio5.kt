package Exercicios

fun execicio1() {
    val capacidadecaixa = 2000
    val capacidadebalao = 7

    var numbaloes = 0
    while ((numbaloes * capacidadebalao) + capacidadebalao < capacidadecaixa) {
        numbaloes++
    }
    println("cabem $numbaloes na caixa de agua")
}

fun execicio2() {

    var i = 1
    while (i <= 50) {

        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        }
        print("$i ")
        i++
    }
}

fun execicio3(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun execicio4(str: String): Boolean {

    val strLower = str.lowercase()
    var contax = 0
    var contaO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            contax++
        } else if (strLower[i] == 'o') {
            contaO++
        }

        i++
    }
    return ((contax == contaO) && (contax != 0))
}


fun main() {
    println(execicio4("xxooox")) //true
    println(execicio4("xxxxo")) //false
    println(execicio4("shdajhsjdajsk"))//false
    println(execicio4("oooxzzzzz")) //false
    println(execicio4("oooXzzzzz"))
}