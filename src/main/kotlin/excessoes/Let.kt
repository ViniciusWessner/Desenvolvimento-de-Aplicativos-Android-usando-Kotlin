package excessoes

fun main() {
    val str3: String? = null

    //anteriormente utilizariamos a seguinte

    if (str3 != null){
        str3.length
        str3.lowercase()
    }

    /*
        Utilizando o let podemos realizar da mesma forma, porem no let o lowercase e length só funcionaria
        se a variável str3 nao fosse nula, então basciamente o let ele validaria pra gente se é null ou nao

    */

    str3?.let {
        str3.lowercase()
        str3.length
    }
}