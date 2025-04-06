/*7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados.
Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
 */
fun main() {
    val superior = 72
    println("Entre com o primeiro valor: ")
    var valor1 = readln().toInt()
    println("Entre com o segundo valor: ")
    var valor2 = readln().toInt()
    println("Entre com o terceiro valor: ")
    var valor3 = readln().toInt()
    println("Entre com o quarto valor: ")
    var valor4 = readln().toInt()
    println("Entre com o quinto valor: ")
    var valor5 = readln().toInt()
    println("Entre com o sexto valor: ")
    var valor6 = readln().toInt()

    var valores = listOf(valor1, valor2, valor3, valor4, valor5, valor6)

    var soma = 0

    for (valor in valores) {
        if (valor < superior) {
            soma += valor
        }
    }

    println("A soma dos valores menores que $superior é: $soma")
    println("Valores inseridos: ${valor1}, ${valor2}, ${valor3}, ${valor4}, ${valor5}, ${valor6}")
}