package MaisSobreParametros

fun main() {

    //podemos inserir os valores na ordem correta ignorando os que possuem um parâmetro
    endereco("street", "montenegro", "rs", "951848", "10")

    //conseguimos também inserir valores que a funcao pede em ordem diferentes da que o kotlin pede, porem precisamos inserir o valor junto do funcao
    endereco(cidade = "Porto alegre", estado = "Porto alegre", cep = "95780", numerocasa = "30", rua = "est cylon")
}
/*
* na função mesmo podemos inserir algums retornos que posteriormente podemos tratalos, por exemplo o numero 0
que informamos abaixo, podemos tratar informações que recebemos com estes numeros
* */
fun endereco(rua: String, cidade: String, estado: String, cep: String = "", numerocasa: String)  {

}