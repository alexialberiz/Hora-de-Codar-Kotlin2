/*8. Escreva um programa que calcule a média de quatro números informados pelo usuário,
mas somente se esses números forem maiores que 0 e menores que 10. No final,
se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
 */

fun main() {

    println("Entre com o primeiro valor: ")
    var valor1 = readln().toDouble()
    println("Entre com 0 segundo valor: ")
    var valor2 = readln().toDouble()
    println("Entre com 0 terceiro valor: ")
    var valor3 = readln().toDouble()
    println("Entre com 0 quarto valor: ")
    var valor4 = readln().toDouble()

    if (valor1 > 0 && valor1 < 10){
        var media = (valor1 + valor2 + valor3 + valor4) / 4
    }
    if (valor2 > 0 && valor2 < 10){
        var media = (valor1 + valor2 + valor3 + valor4) / 4
    }
    if (valor3 > 0 && valor3 < 10){
        var media = (valor1 + valor2 + valor3 + valor4) / 4
    }
    if (valor4 > 0 && valor4 < 10){
        var media = (valor1 + valor2 + valor3 + valor4) / 4
        println("Média: ${media}")
        if (media >= 5) {
            println("Você passou no teste!")
        } else {
            println("Tente novamente!")
        }
    }

}
