/*4. Faça um programa que leia 3 valores informados pelo usuário
(considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
 */
fun main() {
    print("Digite o primeiro valor: ")
    val a = readln().toInt()

    print("Digite o segundo valor: ")
    val b = readln().toInt()

    print("Digite o terceiro valor: ")
    val c = readln().toInt()

    val somaDosMaiores = a + b + c - minOf(a, b, c)

    println("A soma dos dois maiores valores é: $somaDosMaiores")
}

