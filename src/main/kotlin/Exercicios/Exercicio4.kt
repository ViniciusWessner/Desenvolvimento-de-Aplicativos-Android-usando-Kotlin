package Exercicios


fun main() {
    exec5(5)
}

fun exec1() {
    var i = 0
    for (i in 1..50)
        print("$i")
        i++
}

fun exec2(){
    var i = 0
    for (i in 50 downTo 1)
        print("$i")
        i++
}

fun exec3(){
    var i = 0
    for (i in 1..50)
        if (i%5 ==0){
            continue
        }
        print("$i")
}

fun exec4(){
    var soma = 0
    var i = 0
    for (i in 1..500){
        soma += i
    }
        print("$i")
}

fun exec5(n: Int){
    // n = 5
    for (i in 1..n){ //i comeca em 1 vai ate 5 (q eh o N)
       for(j in 1..i){  //1 até i
           print("#")
       }
        println()

}}