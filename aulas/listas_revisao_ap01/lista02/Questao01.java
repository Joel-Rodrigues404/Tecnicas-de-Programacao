// Questão 1:
// a. Enunciado: Um professor de matemática deseja calcular a média das notas de
// seus alunos em uma disciplina. Escreva um pseudocódigo que leia três notas de
// um aluno e calcule a média dessas notas. O pseudocódigo deve exibir a média
// calculada.
// b. Contexto: Este cálculo ajudará o professor a determinar se o aluno passou
// ou não
// na disciplina.

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = input.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = input.nextFloat();

        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("As notas não podem ser negativas!!!");
        } else {
            float media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("A media e %.2f\n", media);
            System.out.printf("Com media de %.2f\n", media);

            if (media >= 7) {
                System.out.printf("O aluno esta Aprovado!");
            } else {
                System.out.printf("O aluno esta Reprovado!");
            }
        }

        input.close();
    }
}
