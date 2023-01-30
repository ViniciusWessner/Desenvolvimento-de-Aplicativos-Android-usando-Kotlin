import OrientacaoaObjetos.Pessoas

/*

    Observe nesse caso aqui que quando vamos estanciar nosso metodos o codigo acaba se tornando muito grande
    e é nesses cenarios que o With entra em açaão, apenas estanciamos a variavel, e dentro dele conseguimos chamar todos os métodos que possuimos
* */
fun main() {
    val pessoaCriadaParaTeste = Pessoas("Viniciuswessner",14052001)
    pessoaCriadaParaTeste.acordar1()
    pessoaCriadaParaTeste.dormir1()

    with(pessoaCriadaParaTeste){
        acordar1()
        dormir1()
    }

}