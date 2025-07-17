// Uma cidade registrou suas temperaturas mínimas diárias durante uma semana.
// O setor meteorológico quer entender o comportamento climático com base
// nessa semana. Ao final, ele deseja um resumo com as seguintes informações:
// - A média semanal.
// - Quantos dias foram acima da média, Abaixo da média ou iguais à média.
// Implemente um algoritmo em Java com essas informações.

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] temperaturas = new int[7];
        int somaTemp = 0;

        for (int i = 0; i < 7; i++) {
            int temperatura = input.nextInt();
            temperaturas[i] = temperatura;
            somaTemp = somaTemp + temperatura;
        }

        float mediaTemp = somaTemp / 7;

        int[] conts = new int[3];

        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > mediaTemp) {
                conts[0] = conts[0] + 1;
            }
            if (temperaturas[i] < mediaTemp) {
                conts[1] = conts[1] + 1;
            }
            if (temperaturas[i] == mediaTemp) {
                conts[2] = conts[2] + 1;
            }
        }

        System.out.println("Media: " + mediaTemp);
        System.out.println("Numeros de dias acima da media " + conts[0]);
        System.out.println("Numeros de dias abaixo da media " + conts[1]);
        System.out.println("Numeros de dias iguais a media " + conts[2]);

        input.close();
    }
}
