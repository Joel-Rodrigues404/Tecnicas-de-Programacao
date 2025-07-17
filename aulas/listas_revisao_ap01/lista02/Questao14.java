// Questão 14:
// a. Enunciado: Um sistema de controle de qualidade precisa verificar se um produto
// está dentro das especificações de peso. Escreva um pseudocódigo que leia o
// peso de um produto e determine se ele está entre 50 e 100 gramas. O
// pseudocódigo deve exibir uma mensagem indicando se o produto está dentro
// das especificações.
// b. Contexto: Essa verificação é importante para garantir a qualidade dos produtos
// fabricados.

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso do produto (em gramas): ");
        float peso = input.nextFloat();

        if (peso >= 50 && peso <= 100) {
            System.out.println("O produto está dentro das especificações.");
        } else {
            System.out.println("O produto está fora das especificações.");
        }

        input.close();
    }
}
