
// Um banco oferece 4 tipos de operação:
// Código
// 1
// 2
// 3
// 4
// Operações
// Depósito
// Saque
// Transferência
// Pagamento de boletos
// Durante o dia, um cliente realizou 10 operações. Implemente um algoritmo para
// exibir um resumo com a contagem de cada tipo de operação.
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int deposito = 0;
        int saque = 0;
        int tranferencia = 0;
        int pagamento = 0;

        for (int i = 0; i < 10; i++) {
            int operacao = input.nextInt();

            if (operacao == 1) {
                deposito++;
            }
            if (operacao == 2) {
                saque++;
            }
            if (operacao == 3) {
                tranferencia++;
            }
            if (operacao == 4) {
                pagamento++;
            }
        }

        System.out.println("numero de depositos " + deposito);
        System.out.println("numero de saques " + saque);
        System.out.println("numero de Transferrencias " + tranferencia);
        System.out.println("numero de pagamentos " + pagamento);

        input.close();
    }
}
