/* 6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
o último e o maior de todos eles (considere que todos os números informados serão diferentes)
 */
fun main() {

    println("Entre com o primeiro valor: ")
    var valor1 = readln().toInt()
    println("Entre com o segundo valor: ")
    var valor2 = readln().toInt()
    println("Entre com o terceiro valor: ")
    var valor3 = readln().toInt()
    println("Entre com o quarto valor: ")
    var valor4 = readln().toInt()

    println("Primeiro valor: ${valor1}")
    println("Ultimo valor: ${valor4}")

    var maior = valor1

    if (valor2 > maior) {
        maior = valor2
    }
    if (valor3 > maior) {
        maior = valor3
    }
    if (valor4 > maior) {
        maior = valor4
    }

    println("Valor maior: ${maior}")

}
