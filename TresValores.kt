//3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

fun main() {

    println("Entre com o primeiro valor: ")
    var n1 = readln().toInt()
    println("Entre com o segundo valor: ")
    var n2 = readln().toInt()
    println("Entre com o terceiro valor: ")
    var n3 = readln().toInt()

    if (n1 > n2 && n1 > n3){
        println("O primeiro valor é maior: ${n1}")
    } else if(n2 > n1 && n2 > n3){
        println("O segundo valor é maior: ${n2}")
    } else {
        println("O terceiro valor é maior: ${n3}")
    }


}