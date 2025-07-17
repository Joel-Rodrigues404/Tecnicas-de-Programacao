// Questão 18:
// a. Enunciado: Um sistema de controle de produção precisa calcular o tempo total de
// produção de um lote de produtos. Escreva um pseudocódigo que leia o número
// de produtos e o tempo de produção de cada produto, e calcule o tempo total de
// produção. O pseudocódigo deve exibir o tempo total.
// b. Contexto: Esse cálculo ajudará a empresa a planejar melhor o tempo de
// produção.

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de produtos: ");
        int numProdutos = input.nextInt();

        System.out.println("Digite o tempo de produção de cada produto em segundos: ");
        int tempProducao = input.nextInt();

        int tempoTotalProducao = numProdutos * tempProducao;

        if (tempoTotalProducao < 0) {
            System.out.println("Os valores não podem ser negativos!!!");
        } else {
            float tempoTotalProducaoMinutos = tempoTotalProducao / 60.0f;
            float tempoTotalProducaoHoras = tempoTotalProducaoMinutos / 60.0f;

            System.out.println("Seu salario liquido e R$" + tempoTotalProducao + " segundos");
            System.out.println("Seu salario liquido e R$" + tempoTotalProducaoMinutos + " minutos");
            System.out.println("Seu salario liquido e R$" + tempoTotalProducaoHoras + " horas");
        }

        input.close();
    }
}
