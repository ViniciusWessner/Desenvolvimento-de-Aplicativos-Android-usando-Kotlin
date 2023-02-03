package POOheranca


/*

MODIFICADORES DE VISIBILIDADE
 Private val : Significa que é privado apenas para a classe somente que esta instanciado
 Open: Deixamos a classe liberada para todos os arquivos

 Privete Class x: Nesse caso a classe vai ficar disponievl somente para dentro do arquivo que esta criadam, nao pode ser instanciada externamente
 Open Class x: Agora conseguimos acessaar a classe x através de outros arquivos
 Public class x: o public ele é usado por padrão em uma classe ou vall
 Protected: ele da o acesso somente a quem esta herdando a classe utilizar o parametro

 

* */

open class Eletronico(var marca: String) {
    //agora o ativar corrente pertence somente ao eletronico
    private fun ativarCorrente(){
        println("ativando a corrente")
        ativarCorrente()
    }

    fun ligar() {
        println("ligando o pc")
        ativarCorrente()
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
    //Agora nao conseguimos ativar a corrente porque ele nao tem naada a ver com o pc
    //c.ativarCorrente()
    println(c.marca)

    //usando os proprios comportamentos
    c.instalaSoftware()
    c.abrePrograma()
}