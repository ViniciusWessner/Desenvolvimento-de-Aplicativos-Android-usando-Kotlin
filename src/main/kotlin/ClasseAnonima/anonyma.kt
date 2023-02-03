package ClasseAnonima

interface Event{
    fun onSuccess()
}

class Programa{
    fun salvar(e: Event){
        println("Abrindo conexão")
        println("Salvando valores")
        println("Sucesso, Conexoes Fechadas")
        e.onSuccess()

    }
}


fun main() {
    val p = Programa()

    p.salvar(object : Event{
        override fun onSuccess() {
            println("On Success")
        }
    })
}