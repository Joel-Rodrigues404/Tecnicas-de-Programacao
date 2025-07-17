// Questão 11:
// a. Enunciado: Um sistema de biblioteca precisa calcular a multa por atraso na
// devolução de livros. Escreva um pseudocódigo que leia o número de dias de
// atraso e calcule a multa, considerando que a multa é de R$ 0,50 por dia de atraso.
// O pseudocódigo deve exibir o valor total da multa.
// b. Contexto: Esse cálculo ajudará a biblioteca a cobrar corretamente as multas por
// atraso.

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de dias de atraso: ");
        float diasAtraso = input.nextFloat();

        float valorMulta = diasAtraso * 0.50f;

        if (diasAtraso < 0) {
            System.out.println("Número de dias de atraso inválido.");
        } else {
            System.out.println("O valor total da multa é: R$ " + valorMulta);
        }

        input.close();
    }
}
