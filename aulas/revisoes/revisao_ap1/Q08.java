// Em uma pesquisa online, os participantes respondem com uma nota de 1 a 5
// sobre nível de satisfação. As respostas são armazenadas em uma lista. No
// final,
// deseja-se saber:
// -
// -
// A porcentagem de participantes satisfeitos (nota 4 ou 5)
// A nota média geral
// Implemente esse algoritmo em Java.
// Dicas: Use ArrayList para armazenar notas válidas e defina um critério de
// parada (pode ser quando o usuário digitar uma nota inválida ou quando ele
// digitar algo específico).

import java.util.Scanner;
import java.util.ArrayList;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = 1;
        int cont = 0;
        int somaNotas = 0;
        int satisfs = 0;
        ArrayList<Integer> notas = new ArrayList<Integer>();

        while (nota <= 5 && nota >= 1) {
            System.out.print("digite uma nova nota: ");
            nota = input.nextInt();

            notas.add(nota);

            if (nota > 0 && nota <= 5) {
                somaNotas = somaNotas + nota;
                cont = cont + 1;
                if (nota >= 4) {
                    satisfs = satisfs + 1;
                }
            }
        }

        System.out.println("somaNotas = " + somaNotas);
        System.out.println("cont = " + cont);
        System.out.println("satisfs = " + satisfs);

        float media = (float) somaNotas / cont;
        float percentSatisf = ((float) satisfs / cont) * 100;

        System.out.println(media);
        System.out.println(percentSatisf + "%");

        input.close();
    }
}
