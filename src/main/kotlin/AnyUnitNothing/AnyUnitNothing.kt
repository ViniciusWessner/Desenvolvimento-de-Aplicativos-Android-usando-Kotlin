package AnyUnitNothing

fun main() {
    //exemplo com ANY
    valores("string")
    valores(1)
    valores(false)

    //exemplo com UNIT

}

//any - conseguimos passar para a funcao que possui any como parametro qualquer valor conforme exemplo acima, qualuqer tipo de dados
 fun valores(value: Any){
 }


//unit - A funcao unit basicamente executa todo o corpo dela porem nao nos retorna nenhum valor
fun valores2( valores: String): Unit{
    //corpo da funcao
}


//nothing - ele retorna somente uma exceaaão, nada alem disso
fun valores3( valores: String): Nothing{
    TODO("Ainda não implementado")
}

fun savefordb(){
    TODO("Ainda nao consegui impelementar o salvar dos dados no DB")
}

fun updateforDB(){
    TODO("os tipos de parametros sao esses aq")
}