import java.util.Scanner;

public class ForLoopBasic {
    public static void main(String[] args) {
        System.out.println("Imprimir de 1 a 10:\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nImprimir os números pares de 0 a 20:\n");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nSomar os números de 1 a 100:\n");

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }

        System.out.printf("soma: %d", soma);

        System.out.println("\n\nTabuada de um número:\n");
        // Peça ao usuário um número (por exemplo, 7) e mostre a tabuada dele de 1 a 10.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        input.close();
    }
}
