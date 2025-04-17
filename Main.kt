/*1. Uma micro calculadora
Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a
serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.*/

fun main() {
    var resultado : Double? = 0.0

    println("Digite o primeiro valor: ")
    var valor1 = readln().toDouble()
    println("Digite o segundo valor: ")
    var valor2 = readln().toDouble()

    println("Escolha a operação (1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação): ")
    var operacao = readln().toInt()

    if (operacao == 1){
        resultado = valor1 + valor2
        println("Resultado da Adição: ${resultado}")
    }
    if (operacao == 2){
        resultado = valor1 - valor2
        println("Resultado da Adição: ${resultado}")
    }
    if (operacao == 3){
        resultado = valor1 % valor2
        println("Resultado da Adição: ${resultado}")
    }
    if (operacao == 4) {
        resultado = valor1 * valor2
        println("Resultado da Adição: ${resultado}")
    }
}