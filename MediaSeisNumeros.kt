/* 5.  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e
escreva a média aritmética desses valores lidos.
 */
fun main() {

    println("Entre com o primeiro valor: ")
    var n1 = readln().toDouble()
    println("Entre com o segundo valor: ")
    var n2 = readln().toDouble()
    println("Entre com o terceiro valor: ")
    var n3 = readln().toDouble()
    println("Entre com o quarto valor: ")
    var n4 = readln().toDouble()
    println("Entre com o quinto valor: ")
    var n5 = readln().toDouble()
    println("Entre com o sexto valor: ")
    var n6 = readln().toDouble()

    println("Os números informados foram: ${n1}, ${n2}, ${n3}, ${n4}, ${n5}, ${n6}")

    var media = (n1 + n2 + n3 + n4 + n5 + n6) / 6

    println("A média final dos número é: ${media}")


}