package POOheranca


open class Eletronico(var marca: String) {
    fun ligar() {
        println("ligando o pc")
    }

    fun desligar() {
        println("desligando o pc")
    }
}


class Computador(marca: String) : Eletronico(marca) {
    fun instalaSoftware() {}
    fun abrePrograma() {}
}


fun main() {
    var c: Computador = Computador("dell")
    //usando os comportamentos comuns
    c.ligar()
    c.desligar()
    println(c.marca)

    //usando os proprios comportamentos
    c.instalaSoftware()
    c.abrePrograma()
}