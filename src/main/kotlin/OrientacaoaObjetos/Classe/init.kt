package OrientacaoaObjetos.Classe

class Animal(var especie: String){

    var fala = ""
    init {
        if (especie == "gato"){
            fala = "miau"
        }
    }

    init {
        if (especie == "cachorro"){
            fala = "auau"
        }
    }


}


fun main() {
    Animal("cachorro").fala
    println(Animal("cachorro").fala)
}