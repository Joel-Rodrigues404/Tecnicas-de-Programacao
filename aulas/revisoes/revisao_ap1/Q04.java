// Em um sistema bancário, o usuário pode tentar digitar sua senha até 3 vezes. A
// senha correta é 6789. O sistema deve exibir:
// - “Acesso permitido” se a senha estiver correta
// - “Senha incorreta” para tentativas inválidas
// - “Conta bloqueada” após 3 tentativas inválidas
// Implemente essa lógica em Java.

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 6789;
        int erro = 0;

        while (erro < 3) {
            int senha_user = input.nextInt();

            if (senha_user == senha) {
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("Acesso bloqueado");
                erro = erro + 1;
            }
        }

        if (erro >= 3) {
            System.out.println("Conta bloqueada");
        }

        input.close();
    }
}
