import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = -1;

        while (num < 0) {
            System.out.print("Digite um numero: ");
            num = input.nextInt();
        }

        if (num % 2 == 0) {
            System.out.println("Codigo Valido! Lancamento Autorizado");
        } else {
            System.out.println("Codigo Invalido! Risco de Instabilidade!");
        }

        input.close();
    }
}
