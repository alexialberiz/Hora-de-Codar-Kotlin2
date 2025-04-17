/* 9. Escreva um programa para ler o ano de nascimento de uma pessoa e
escrever uma mensagem que diga se ela poderá ou não votar este ano
(não é necessário considerar o mês em que ela nasceu).*/

fun main() {
    println("Entre com o seu ano de nascimento: ")
    var ano = readln().toInt()
    println("Entre com o ano atual: ")
    var anoAtual = readln().toInt()
    println("Entre com sua idade: ")
    var idade = readln().toInt()

    if(idade >= 16){
        println("O seu ano e sua idade são: ${ano} e ${idade}, então você pode votar!")
    } else {
        println("O seu ano e sua idade são: ${ano} e ${idade}, então você não pode votar!")
    }

}
