// Questão 19:
// a. Enunciado: Um sistema de cálculo de desconto precisa determinar o valor final de
// uma compra após aplicar um desconto. Escreva um pseudocódigo que leia o
// valor da compra e a porcentagem de desconto, e calcule o valor final. O
// pseudocódigo deve exibir o valor final da compra.
// b. Contexto: Esse cálculo ajudará os clientes a saberem o valor final a ser pago após
// o desconto.

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valorCompra = input.nextFloat();

        System.out.println("Digite a porcentagem de desconto: ");
        float porcentagem = input.nextFloat();

        float valorCompraFinal = valorCompra - (valorCompra * (porcentagem / 100));

        if (valorCompraFinal < 0) {
            System.out.println("Os valores não podem ser negativos!!!");
        } else {
            System.out.println("Valor final da compra: R$" + valorCompraFinal);
        }

        input.close();
    }
}
