package br.com.digitalhouse.olamundo

fun main() {
    println(comparartextos("ameixa", "amaaeixa"))
}

fun comparartextos(texto1 : String, texto2 : String) : Boolean{
    return(texto1 != texto2)
}