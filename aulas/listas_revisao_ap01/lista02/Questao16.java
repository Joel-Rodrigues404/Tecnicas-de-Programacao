// Questão 16:
// a. Enunciado: Um sistema de controle de estoque precisa calcular o valor
// total dos
// produtos em estoque. Escreva um pseudocódigo que leia a quantidade de
// produtos e o preço unitário de cada produto, e calcule o valor total em
// estoque.
// O pseudocódigo deve exibir o valor total.
// b. Contexto: Esse cálculo ajudará a empresa a monitorar o valor dos produtos
// em
// estoque.

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos em estoque: ");
        int quantidadeProdutos = input.nextInt();

        System.out.println("Digite o preço unitário de cada produto: ");
        float precoUnitario = input.nextFloat();

        float valorTotalEstoque = quantidadeProdutos * precoUnitario;

        input.close();

        // if (valorTotalEstoque < 0) {
        // throw new IllegalArgumentException("O valor total do estoque não pode ser
        // negativo.");
        // }

        if (valorTotalEstoque < 0) {
            System.out.println("O valor total do estoque não pode ser negativo.");
        } else {
            System.out.println("O valor total dos produtos em estoque é: R$ " + valorTotalEstoque);
        }
    }
}
