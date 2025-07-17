// Questão 5:
// a. Enunciado: Um sistema de monitoramento de temperatura precisa identificar a
// menor temperatura registrada em três sensores diferentes. Escreva um
// pseudocódigo que leia três temperaturas e determine qual é a menor. O
// pseudocódigo deve exibir a menor temperatura.
// b. Contexto: Isso ajudará na análise das condições ambientais monitoradas pelos
// sensores.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço da temperatura 1");
        float temperatura1 = input.nextFloat();

        System.out.println("Digite o preço da temperatura 2");
        float temperatura2 = input.nextFloat();

        System.out.println("Digite o preço da temperatura 3");
        float temperatura3 = input.nextFloat();

        if (!(temperatura1 == temperatura2 && temperatura2 == temperatura3)) {
            List<Float> temperaturas = new ArrayList<>();

            temperaturas.add(temperatura1);
            temperaturas.add(temperatura2);
            temperaturas.add(temperatura3);

            System.out.printf("A menor temperatura é: %.2f\n", Collections.min(temperaturas));
        } else {
            System.out.println("As temperaturas são iguais");
        }
        input.close();
    }
}
