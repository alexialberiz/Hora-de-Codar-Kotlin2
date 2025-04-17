/* 10. Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - )
de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.*/

fun main() {
    var genero : String = "Feminino"
    var genero1 : String = "Masculino"
    var pesoIdeal : Double? = 0.0
    println("Digite o seu sexo biológico: ")
    genero = readln()
    println("Digite sua altura: ")
    var altura = readln().toDouble()

    if(genero == genero){
        pesoIdeal = (62.1 * altura) - 44.7
    }
    if(genero == genero1){
        pesoIdeal = (72.7 * altura) - 58
    }
    println("O seu peso ideal, é: ${pesoIdeal}")

}
