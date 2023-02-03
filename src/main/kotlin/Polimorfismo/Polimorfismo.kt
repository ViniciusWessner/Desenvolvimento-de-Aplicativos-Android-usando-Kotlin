package Polimorfismo

interface Funcionario{
    var salario: Float
    fun bonus(): Float
}

class Gerente (override var salario: Float): Funcionario{
    override fun bonus(): Float {
        TODO("Not yet implemented")
        return salario * 0.05f
    }
}

class Analista(override var salario: Float) : Funcionario{
    override fun bonus(): Float {
        TODO("Not yet implemented")
        return salario * 0.02f
    }
}

fun mostraBonus(func: Funcionario){
    println(func.bonus())

}


fun main() {

    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(3000f))
}
