package Colecoes

fun main() {

    /*

        O set ele não é uma lista, set é um conjunto de valores então ele nao tem index, igual o list

     */



    //o set nao permite valores duplicados
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("Sao paulo")
    set2.remove("Sao Paulo")
    set2.contains("São paulo")

}