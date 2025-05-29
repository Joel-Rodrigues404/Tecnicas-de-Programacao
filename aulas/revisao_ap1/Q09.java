// Um cinema possui uma sala com 5 fileiras com 6 assentos cada e deseja fazer
// um sistema para reserva de cada assento dessa sala. Nesse sistema, os
// assentos vagos devem receber valor 0 e os reservados valor 1. Ao final, deve
// ser
// exibido um mapa dos assentos.
// Obs: Para parar a entrada, o usuário deve digitar –1 –1.

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] sala = new int[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = 0;
            }
            System.out.println();
        }

        System.out.print("Digite quantos assentos vai reservar: ");
        int qtd_assentos_pra_reservar = input.nextInt();
        int fileira = 0;
        int coluna = 0;

        for (int i = 0; i < qtd_assentos_pra_reservar; i++) {
            System.out.print("Digite a fileiras do assento: ");
            fileira = input.nextInt();

            System.out.print("Digite a coluna do assento: ");
            coluna = input.nextInt();

            sala[fileira][coluna] = 1;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
