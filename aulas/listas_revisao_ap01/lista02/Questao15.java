// Questão 15:
// a. Enunciado: Um sistema de cálculo de frete precisa determinar o custo do frete
// com base na distância percorrida. Escreva um pseudocódigo que leia a distância
// em quilômetros e calcule o custo do frete, considerando que o custo é de R$ 1,20
// por quilômetro. O pseudocódigo deve exibir o valor total do frete.
// b. Contexto: Esse cálculo ajudará a empresa de transporte a cobrar corretamente
// pelo serviço de frete.

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em quilômetros): ");
        float distancia = input.nextFloat();

        float valorFrete = distancia * 1.20f;

        if (distancia < 0) {
            System.out.println("A distância não pode ser negativa.");
        } else {
            System.out.println("O valor total do frete é: R$ " + valorFrete);
        }

        input.close();
    }
}
