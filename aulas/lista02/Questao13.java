// Questão 13:
// a. Enunciado: Um sistema de gerenciamento de eventos precisa calcular o total
// arrecadado com a venda de ingressos. Escreva um pseudocódigo que leia o
// número de ingressos vendidos e o preço de cada ingresso, e calcule o total
// arrecadado. O pseudocódigo deve exibir o valor total arrecadado.
// b. Contexto: Esse cálculo ajudará os organizadores do evento a monitorar as vendas
// de ingressos.

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de ingressos vendidos: ");
        int ingressosVendidos = input.nextInt();

        System.out.println("Digite o preço de cada ingresso: ");
        float precoIngresso = input.nextFloat();

        float totalArrecadado = ingressosVendidos * precoIngresso;

        if (totalArrecadado < 0) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Total arrecadado: R$ " + totalArrecadado);
        }

        input.close();
    }
}
