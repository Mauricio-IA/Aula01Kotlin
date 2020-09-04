package br.com.digitalhouse.olamundo

fun main() {
    println("Olá Mundo!")
    println(mostrarMeuNome("Mauricio",20))
    println(alunosDeAndroid())
    println("--------------------------------------")
    println("Lista de alunos")
    println("--------------------------------------")
    for(nome in  alunosDeAndroid()){
        println("Nome do aluno: $nome")
    }
}

fun mostrarMeuNome(sobrenome: String, idade: Int) : String{
    val idaderecebida = when(idade){
        18 -> "Tem 18 anos"
        20 -> "Tem 20 anos"
        30 -> "Tem 30 anos"
        else -> "nao sabe a idade"
    }
    return "Mauricio $sobrenome $idaderecebida"
}

fun alunosDeAndroid(): ArrayList<String> {
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Vitória")
    listaAlunos.add("João")
    listaAlunos.add("André")

    return listaAlunos
}