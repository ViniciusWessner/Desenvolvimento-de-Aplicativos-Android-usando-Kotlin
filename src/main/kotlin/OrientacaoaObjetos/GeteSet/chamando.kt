package OrientacaoaObjetos.GeteSet

class Animal(var especie:String){
    var fala = ""

        get() {
            println("acesso ao get")
            return field
        }

        set(value) {
            println("Adicionando set")
            field = value
        }

}
fun main() {

    var sobreplanetas: Planeta = Planeta()
    var Conta: ContaBancaria = ContaBancaria()
    var animal: Animal = Animal("cachorro")


}