// Um sistema de processamento de imagens simplificado representa uma
// imagem de 9 pixels por uma matriz 3x3, onde cada célula armazena uma letra
// representando uma cor primária:
// -
// -
// -
// “R” para vermelho
// “G” para verde
// “B” para azul
// Implemente um algoritmo em Java onde é exibido a matriz imagem, a contagem
// de cores que aparece nessa matriz, qual a cor dominante e se a imagem estar
// saturada (uma cor aparecer mais do que 5 vezes).

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] imagem = new String[3][3];
        int conts[] = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                imagem[i][j] = input.next().toUpperCase();
                if (imagem[i][j].equals("R")) {
                    conts[0] = conts[0] + 1;
                }
                if (imagem[i][j].equals("G")) {
                    conts[1] = conts[1] + 1;
                }
                if (imagem[i][j].equals("B")) {
                    conts[2] = conts[2] + 1;
                }
            }
        }

        int maior = conts[0];
        int indiceMaior = 0;

        for (int i = 0; i < 3; i++) {
            if (conts[i] > maior) {
                maior = conts[i];
                indiceMaior = i;
            }

            for (int j = 0; j < 3; j++) {
                System.out.print(imagem[i][j] + " ");
            }
            System.out.println();
        }

        if (indiceMaior == 0) {
            System.out.println("Cor dominante Red");
            if (conts[0] > 5) {
                System.out.println("E esta saturado");
            }
        }
        if (indiceMaior == 1) {
            System.out.println("Cor dominante Green");
            if (conts[1] > 5) {
                System.out.println("E esta saturado");
            }
        }
        if (indiceMaior == 2) {
            System.out.println("Cor dominante Blue");
            if (conts[2] > 5) {
                System.out.println("E esta saturado");
            }
        }
        input.close();
    }
}
