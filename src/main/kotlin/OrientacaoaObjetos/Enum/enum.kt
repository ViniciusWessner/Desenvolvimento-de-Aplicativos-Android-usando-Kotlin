package OrientacaoaObjetos.Enum

//podemos tambem fazer atribuicoes nas classses, podemos usar o exemplo de um banco onde realizamos um calculo comas a prioridades abaixo e verificamos se nossa priodidade no momento esta muito alto, caso sim, chamamos outro atendente
enum class Prioridades(val ID: Int){
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa: $ID"
        }
            },
    Média(5){
        override fun toString(): String {
            return "Prioridade Baixa: $ID"
        }
            },
    Alta(10){
        override fun toString(): String {
            return "Prioridade Alta: $ID"
        }
    }
}

enum class  AnimalEnum{
    Cachorro, Gato, Cavalo, vaca
}

fun x(p: Prioridades){

}


//com a classe enum conseguimos limitar os dados de todos os itens que precisamos, assim facilita toda a logica
fun main() {
    x(Prioridades.Baixa)

    for (p in Prioridades.values()){
        println(p)
    }
}