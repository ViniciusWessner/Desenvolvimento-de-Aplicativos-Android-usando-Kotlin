package Object

class Matematica{

    companion object{
        val PI = 3.1415
        fun teste(){}
    }

    init {
        println("fui inicializado")
    }


    object obj1{
        val PI = 3.1415
        fun teste(){}
    }


}

fun main() {
    Matematica.PI
    Matematica.teste()

    Matematica.obj1.PI
    Matematica.obj1.teste()
}