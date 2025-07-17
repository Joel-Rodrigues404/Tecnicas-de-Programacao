// Questão 10:
// a. Enunciado: Um sistema de controle de produção precisa verificar se a
// quantidade
// de produtos fabricados é múltiplo de 5 para otimizar o processo de embalagem.
// Escreva um pseudocódigo que leia um número e determine se ele é um múltiplo
// de 5. O pseudocódigo deve exibir uma mensagem indicando o resultado.
// b. Contexto: Essa verificação ajudará a otimizar o processo de embalagem dos
// produtos.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos fabricados: ");
        int quantidadeProdutos = input.nextInt();

        if (quantidadeProdutos < 0) {
            System.out.println("A quantidade de produtos não pode ser negativa.");
        } else {
            if (quantidadeProdutos % 5 == 0) {
                System.out.println("A quantidade de produtos fabricados é múltiplo de 5.");
            } else {
                System.out.println("A quantidade de produtos fabricados não é múltiplo de 5.");
            }
        }

        input.close();
    }
}
