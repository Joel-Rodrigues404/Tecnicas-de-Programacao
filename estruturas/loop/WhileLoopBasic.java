import java.util.Scanner;

public class WhileLoopBasic {
    public static void main(String[] args) {

        System.out.println("\n\nImprimir ate 10\n");

        int num = 0;

        while (num < 10) {
            num = num + 1;
        }

        System.out.println(num);

        System.out.println("\n\nImprimir pares de 0 a 20\n");

        int num2 = 0;

        while (num2 <= 20) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
            num2 = num2 + 1;
        }

        System.out.println("\n\nSomar de 0 a 100\n");
        
        int num3 = 0;
        int soma = 0;

        while (num3 <= 100) {
            soma = soma + num3;
            num3 = num3 + 1;
        }

        System.out.println(soma);

        System.out.println("\n\nTabuada de um numero (n) \n");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num4 = input.nextInt();
        int cont = 1;

        while (cont <= 10) {
            System.out.printf("%d x %d = %d\n", num4, cont, cont * num4);
            cont = cont + 1;
        }

        input.close();
    }
}
