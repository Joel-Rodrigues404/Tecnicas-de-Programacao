import java.util.Scanner;

public class testeFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de repetições: ");
        int numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Repetição" + i);
        }

        input.close();
    }
}
