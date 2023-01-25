package OrientacaoaObjetos

class Pessoas(val nomeCompleto: String, val dataNascimento: Int) {

    var Documento: String? = null
    //this: se refere ao escopo da classe, se refere ao objeto
    constructor(dataNascimento: Int, nomeCompleto: String, Documento: String): this(nomeCompleto, dataNascimento){
        this.Documento = Documento
    }

    fun dormir1(){

    }

    fun acordar1(){

    }
}




fun main() {
    var pessoas: Pessoas = Pessoas(2000, "vinicius", "00642433035")
    pessoas.Documento
}