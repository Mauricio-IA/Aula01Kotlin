package br.com.digitalhouse.olamundo

fun main() {
    println(quatroNumeros(1,5,10, 4));
}

fun quatroNumeros(num1 : Int ,num2: Int,num3: Int,num4: Int) : Boolean{
    return (num1>num3 && num1>num4)||(num2>num3 && num2>num4)
}

