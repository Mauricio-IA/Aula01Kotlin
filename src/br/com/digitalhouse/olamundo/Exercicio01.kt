package br.com.digitalhouse.olamundo

fun main() {
    println(analisar(1,5,10));
}

fun analisar(num1 : Int ,num2: Int,num3: Int) : Int{
    if(num1>num2 && num1>num3){
        return num1
    }else if(num2>num1 && num2>num3){
        return num2
    }else{
        return num3
    }
}