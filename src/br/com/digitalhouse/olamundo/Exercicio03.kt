package br.com.digitalhouse.olamundo

fun main() {
    println(parOuImpar(2))
}

fun parOuImpar(numero : Int) : Boolean{
    return(numero % 2 == 0)

}