fun main() {

    //Quando falamos sobre instanciar uma classe, basicamente estamos colocando um objeto em um endereço da memoria
    /*

    * Ex: obj1 -> endereço de memoria 1
    * Ex: obj2 -> endereço de memoria 2

    * */


    //sem o data class
    val f1: Forma = Forma(10,8)
    val f2: Forma = Forma(10,8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("---------")
    println(f2.toString())
    println(f2.hashCode())
    println("************")

    //com o data class
    val f3: FormaData = FormaData(10,8)
    val f4: FormaData = FormaData(10,8)
    println(f3.equals(f4))
    println(f3.toString())
    println(f3.hashCode())
    println("---------")
    println(f4.toString())
    println(f4.hashCode())


}

/*

    No exemplo acima comparamos duas variaveis e seus respectivos lugaras de momoria utilizando utilizando f1.equals(f2)

    class Forma(val a:Int, val b:Int)
    enum class FormaData(val a: Int, val b: Int)

    Já abaixo para compararmos uma classe com uma data class vamos precisar sobreescrever todos os metodos.
    Já com a dataclass ela faz isso sozinha pra nós por debaixo dos panos.


* */

class Forma(val a:Int, val b:Int){
    override fun equals(other: Any?): Boolean {
        if (other is Forma){
            return (other.a == this.a && other.b == this.b)
        }else{
            return false
        }
    }


}
data class FormaData(val a: Int, val b: Int)


