package excessoes

fun main() {

    val str: String? = null
    val elvis: String? = null
    if (str == null){
        print("nulo")
    }else{
        println(str)
    }
    /*Operador elvis ele basicamente realiza uma validação dos nullos sem precisamos utilizar if e else conforme
    o fluxo acima, que acabamos perdendo bastante tempo para criar.

    Com o operador elvis podemos utiliza-lo da seguinte maineira:
     - println(str ?: "nulo")
     Nesse exemplo ele vai validar "str" é nullo? se nao for ele printa str caso seja ele realiza a função ou
     a instrução que orientamos ele a realizar

    */
    println(elvis ?: "Elvis é nullo, informe um valor nao nullo por favor")



    //exemplo de ternario no kotlin
    val idade = 18
    val str2 = if (idade > 18 ) "maior de idade" else "menor de idade"
}

