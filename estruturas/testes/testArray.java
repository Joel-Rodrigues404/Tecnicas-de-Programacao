import java.util.Scanner;

public class testArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho_do_array = input.nextInt();

        int[] numeros = new int[tamanho_do_array];
        System.out.println("Agora o array tem tamanho " + tamanho_do_array);

        for (int i = 0; i < tamanho_do_array; i++) {
            numeros[i] = input.nextInt();
            System.out.printf("array no indice %d tem valor %d\n", i, numeros[i]);
        }

        input.close();
    }
}
