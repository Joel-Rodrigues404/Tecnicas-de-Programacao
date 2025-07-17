// 1.Uma empresa deseja controlar o acesso dos funcionários a determinadas áreas
// com base no cargo e no tempo de empresa. As regras para o acesso são as
// seguintes:
// - Apenas funcionários com cargo "gerente" ou "diretor" e com mais de 2 anos
// de empresa podem acessar a sala de segurança.
// - Todos os demais têm acesso negado.
// Implemente esse algoritmo.

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cargo = input.next();
        int tempo_impresa = input.nextInt();

        if ((cargo.equals("gerente") || cargo.equals("diretor")) && tempo_impresa >= 2) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        input.close();
    }
}
