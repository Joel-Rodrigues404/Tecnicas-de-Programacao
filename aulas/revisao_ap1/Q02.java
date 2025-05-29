// 2.Um professor desenvolveu um sistema para avaliar o desempenho dos alunos
// baseados na média final. A lógica é:
// - Média ≥ 7: Aprovado
// - Média ≥ 5 e < 7: Recuperação
// - Média < 5: Reprovado
// Dada a descrição acima, escreva a estrutura de decisão em Java para essa
// lógica.

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }

        input.close();
    }
}
