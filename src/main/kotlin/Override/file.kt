package Override

open class Eletronico(var  marca: String){
    private fun corrente(ativo: Boolean){}

    fun ligar(){
        corrente(true)
    }

   open fun desligar(){
        corrente(false)
    }
}

class Computador(marca: String): Eletronico(marca){

    fun save(){
        println("Salvando arquivos")
    }

    //com o override conseguimos reescrever nossa função somente para a classe que estamos utilizando
    override fun desligar(){
        save()
        super.desligar()

    }

    // com o overload conseguimos usar o mesmo nome da função para diversos arquivos, porem o que diferencia é os parametros que ela possui
    fun save(a: Float){}
    fun save(a: Int){}
}

fun main() {
    val c: Computador = Computador("dell")

    c.ligar()
    c.desligar()
}