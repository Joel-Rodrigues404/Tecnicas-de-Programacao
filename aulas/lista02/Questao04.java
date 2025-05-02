// Questão 4:
// a. Enunciado: Um site de compras online precisa verificar se o usuário é maior de
// idade para permitir a compra de produtos restritos. Escreva um pseudocódigo
// que leia a idade de uma pessoa e determine se ela é maior de idade (18 anos ou
// mais). O pseudocódigo deve exibir uma mensagem indicando se a pessoa é
// maior de idade ou não.
// b. Contexto: Essa verificação é necessária para cumprir as regulamentações de
// venda de produtos restritos.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade < 0) {
            System.out.println("idade inválida.");
        } else {
            System.out.println("Você não é maior de idade.");
        }

        input.close();
    }
}
