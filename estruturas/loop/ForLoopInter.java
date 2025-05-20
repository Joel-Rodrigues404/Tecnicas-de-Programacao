import java.util.Scanner;

public class ForLoopInter {
    public static void main(String[] args) {
        System.out.println("\n\nImprimir todos os múltiplos de 3 entre 1 e 100\n");

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nImprimir os números de 100 até 1 (em ordem decrescente)\n");

        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nImprimir os quadrados dos números de 1 a 10\n");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", i, i, i * i);
        }

        System.out.println("\n\nFatorial de um numero\n");

        System.out.print("Digite um numero: ");
        Scanner input = new Scanner(System.in);

        int soma = 1;
        int num = input.nextInt();

        for (int i = num; i > 0; i--) {
            soma = soma * i;
        }

        System.out.printf("%d! = %d", num, soma);

        input.close();
    }
}
