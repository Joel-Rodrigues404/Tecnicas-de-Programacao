// Questão 7:
// a. Enunciado: Um sistema de análise financeira precisa classificar os valores de
// transações como positivos, negativos ou zero. Escreva um pseudocódigo que leia
// um número e determine se ele é positivo, negativo ou zero. O pseudocódigo
// deve exibir uma mensagem indicando a classificação do número.
// b. Contexto: Essa classificação ajudará na análise das transações financeiras.

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num = input.nextFloat();

        if (num == 0) {
            System.out.println("O número é zero.");
        } else if (num > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        input.close();
    }
}
