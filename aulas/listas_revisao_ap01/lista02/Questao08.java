// Questão 8:
// a. Enunciado: Uma aplicação de saúde deseja calcular o índice de massa corporal
// (IMC) dos usuários para fornecer recomendações personalizadas de dieta e
// exercícios. Escreva um pseudocódigo que leia a altura e o peso de uma pessoa e
// calcule seu IMC. O pseudocódigo deve exibir o IMC calculado.
// b. Contexto: O cálculo do IMC é importante para avaliar a saúde dos usuários e
// fornecer recomendações adequadas.

// IMC = peso / (altura * altura)

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso(KG): ");
        float peso = input.nextFloat();

        System.out.println("Digite sua altura(M): ");
        float altura = input.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 0) {
            System.out.println("Não é possível calcular o IMC com valores negativos.");
        } else {
            System.out.printf("Seu IMC é: %.2f", imc);
        }

        input.close();
    }
}
