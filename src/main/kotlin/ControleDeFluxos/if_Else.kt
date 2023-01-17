package ControleDeFluxos

fun maiordeidade(idade: Int){
    if (idade>18){
        println("Maior de idade")

        if (idade >60){
            println("Terceira idade")
        }


    }else if(idade<10){
        println("Criança")
    }else{
        println("menor de idade")
    }
}


fun saudacao(dia: Boolean): String{
    return if (dia){
        "Bom dia"
    }else{
        "Boa noite"
    }
}

fun main() {

    maiordeidade(15)
    maiordeidade(25)
    maiordeidade(65)

    saudacao(true)

}