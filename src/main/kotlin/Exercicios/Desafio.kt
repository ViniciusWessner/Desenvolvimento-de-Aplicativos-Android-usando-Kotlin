package Exercicios

fun main() {
    //ana 500 + empresa 500 (0,2)
    //paula 500 somente (0,8)
    //quanto tempo paula supera o patrimonio??

    var salario = 10000f
    var patana = 0f
    var patpaula = 0f
    var mes = 0
    

    do {
        patana += (salario*0.05f) + (salario*0.05f)  + (patana + 0.002f)//salario + inv empresa +  rendimento
        patpaula += (salario * 0.05f) + (patpaula * 0.008f)

        println("Patrimonio da ana é $patana")
        println("Patrimonio da paula é $patpaula")
    }while (patana > patpaula)

    println("Rendimento Ana - ${(patana * 0.002f)}")
    println("Rendimento paula - ${(patana * 0.008f)}")
    println("paula vai passar o patrimonio no mes $mes")
}