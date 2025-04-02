//2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

fun main() {

    println("Escreva um número, e informaremos se é positivo, negativo ou ZERO: ")
    var numero = readln().toInt()

    if (numero > 0){
        println("Número positivo: ${numero}")
    }else if(numero < -0){
        println("Número negativo: ${numero}")
    }else if(numero == 0){
        println("Número igual a Zero: ${numero}")
    }

}


