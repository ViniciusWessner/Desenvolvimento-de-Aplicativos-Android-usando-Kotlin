package excessoes

/*
  Com o tryCatch podemos informar exceptions conforme o exemplo abaixo
 -podemos fechar conexoes com o banco, pense em um cenario da seguinte forma: abrimos a conexao com o banco de
 dados para informar a ele alguns dados, porem os dados eram inválidos, neste caso ele daria o erro e me retornaria
 que ocorreu um erro "exception" e entao fecharia o programa. Neste caso podemos usar o "finally" logo abaixo
 e com ele informamos o fechamento do banco de dados db.close

 - Excessão genérica ela deve ser a ultima excessao.

* */

fun main() {
    try {

        val s: String? = null
        val abc = 10/0
        println(s!!.length)

    }catch (e: NullPointerException){
        println("Variável nula!")
    } catch (e: ArithmeticException){
        println("imposssivel dividir por zero, verique a variavel")
    }catch (e: Exception){
        println("Genérica")
    }

    finally {
        println("podemos utilizar o finally para fechar conexoes do banco caso ocorra")
    }
    println("Fim")
}