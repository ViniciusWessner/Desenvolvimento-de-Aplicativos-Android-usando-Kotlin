package OrientacaoaObjetos.Lateinit

class Receita{
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "lave as maos"
    }

    //como saber se a nossa variavel instrucoes ja foi inicializa?

    fun imprimeReceita(){
        if (!this::instrucoes.isInitialized){
            println("nao lave as maos, venha comer")
        }
    }
}


// no exemplo abaixo a variavel instrucoes nao foi inicializada, entao no console vamos printar que nao eh para lavar as maos
fun main() {
    var r: Receita = Receita()
    //r.instucoes
    println(r.imprimeReceita())
}