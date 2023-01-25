package OrientacaoaObjetos

class Pessoa(
    val anoNascimento: Int,
    var nomeCompleto: String,
){
    var olhos: String = ""
    fun dormir(){

    }

    fun acordar(){

    }
}

fun main() {
    // Classe - tem comportamentos e atributos
    //Classe que gera nossos objetos

    var pessoa: Pessoa = Pessoa(2000, "fulano")
    //quando eu instancio uma classe , eu gero um objeto

    //agora conseguimos acessar os atributos da classe que instanciamos
    pessoa.nomeCompleto
    pessoa.anoNascimento
    //conseguimos acessar tambem os comportamentos da nosssa classe
    pessoa.acordar()
    pessoa.dormir()

    //no caso de um variavel dentro de uma classe eu consigo atribuir um valor nela igual abaixo:
    pessoa.olhos = "verdes"
    //ou também posso apenas usar o valor que foi inserido nela da forma abaixo:
    pessoa.olhos
    println(pessoa.olhos)

    println("meu nome é: ${pessoa.nomeCompleto}")
}