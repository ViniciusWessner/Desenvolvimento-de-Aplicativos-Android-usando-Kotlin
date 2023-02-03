package ClasseAbastrata




/*

Uma classe abrstrata basciamente ela carrega com ela uma funcção que vai ser implementada diversas vezes em outras classes
então basicamente o kotlin fala a segiunte coisa: estou criando essa funcao aqui, mas quem vai usar que precisa implementar

* */


//interface nao gurda o estado de uma variavel, podemos ate criar uma variavel porem ela nao armazena o valor
interface  Selvagem{
     fun atacar(){
         println("sfd")
     }
}


abstract class Mamifero (val nome: String) {

    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("dormi")
    }

    //nesse caso aqui não precisamos implementar, porque quem vai herdar se vira para implementar ela
   abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem{

    override fun falar() {
        TODO("sobreescrevendo a funcao da classe mamifero")
    }

    override fun atacar() {
        TODO("funcao atacar")
    }



}

fun main() {

}