
// 1. Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

fun main() {

    println("Escreva o primeiro número: ")
    var n1 = readln().toInt()
    println("Escreva o segundo número: ")
    var n2 = readln().toInt()

    if (n1 > n2) {
        println("O maior número é o primeiro: ${n1}")
    }else{
        println("O número maior é o segundo: ${n2}")
    }
}
