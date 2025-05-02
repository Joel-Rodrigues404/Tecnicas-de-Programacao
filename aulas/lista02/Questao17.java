// Questão 17:
// a. Enunciado: Um sistema de cálculo de salário precisa determinar o salário líquido
// de um funcionário após deduzir impostos. Escreva um pseudocódigo que leia o
// salário bruto e a porcentagem de impostos, e calcule o salário líquido. O
// pseudocódigo deve exibir o valor do salário líquido.
// b. Contexto: Esse cálculo ajudará a empresa a pagar corretamente os funcionários.

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu salario bruto: ");
        float salarioBruto = input.nextFloat();

        System.out.println("Digite quantos porcento de decrecimo no salario: ");
        float porcentagemInpostos = input.nextFloat();

        float salarioLiquido = salarioBruto - (salarioBruto * (porcentagemInpostos / 100));

        if (salarioLiquido < 0) {
            System.out.println("Os valores não podem ser negativos!!!");
        } else {
            System.out.println("Seu salario liquido e R$" + salarioLiquido);
        }

        input.close();
    }
}
