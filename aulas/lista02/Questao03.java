// Questão 3:
// a. Enunciado: Um aplicativo de comparação de preços deseja identificar qual
// produto tem o maior valor entre duas opções. Escreva um pseudocódigo que leia
// os preços de dois produtos e determine qual deles é o maior. O pseudocódigo
// deve exibir o preço do produto mais caro.
// b. Contexto: Isso ajudará os usuários a escolherem o produto mais caro para fins de
// comparação.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do produto 1");
        float precoProduto1 = input.nextFloat();
        System.out.println("Digite o preço do produto 2");
        float precoProduto2 = input.nextFloat();

        if (precoProduto1 < 0 || precoProduto2 < 0) {
            System.out.println("Preço inválido!");
        } else {
            if (precoProduto1 == precoProduto2) {
                System.out.println("Os produtos tem os mesmo preço!");
            } else if (precoProduto1 > precoProduto2) {
                System.out.println("O produto 1 tem preço maior!");
            } else {
                System.out.println("O produto 2 tem preço maior!");
            }
        }

        input.close();
    }
}
