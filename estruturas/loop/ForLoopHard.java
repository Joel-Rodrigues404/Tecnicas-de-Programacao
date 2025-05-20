import java.util.Scanner;

public class ForLoopHard {
    public static void main(String[] args) {
        System.out.println("Numeros primos de 1 a 100\n");

        int contDiv = 0;

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contDiv = contDiv + 1;
                }
            }
            if (contDiv == 2) {
                System.out.printf("O numero %d e primo\n", i);
            }
            contDiv = 0;
        }

        System.out.println("\n\nDesenhar um triângulo de asteriscos\n");

        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
