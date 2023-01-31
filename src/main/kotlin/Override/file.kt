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
    override fun desligar(){
        save()
        super.desligar()

    }
}

fun main() {
    val c: Computador = Computador("dell")

    c.ligar()
    c.desligar()
}