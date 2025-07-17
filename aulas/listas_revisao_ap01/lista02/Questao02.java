// Questão 2:
// a. Enunciado: Um sistema de controle de estoque precisa verificar se a quantidade
// de itens em um armazém é par ou ímpar. Escreva um pseudocódigo que leia um
// número inteiro representando a quantidade de itens e determine se esse número
// é par ou ímpar. O pseudocódigo deve exibir uma mensagem indicando o
// resultado.
// b. Contexto: Essa verificação ajudará na organização do armazenamento dos itens.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de itens do armazém");
        int numItens = input.nextInt();

        if (numItens < 0) {
            System.out.println("Quantidade de itens inválida");
        } else {
            if (numItens % 2 == 0) {
                System.out.printf("O numero %d e par", numItens);
            } else {
                System.out.printf("O numero %d e impar", numItens);
            }
        }
        input.close();
    }
}
