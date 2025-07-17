// Questão 12:
// a. Enunciado: Um sistema de votação precisa verificar se um eleitor está apto a
// votar. Escreva um pseudocódigo que leia a idade de uma pessoa e determine se
// ela tem 16 anos ou mais. O pseudocódigo deve exibir uma mensagem indicando
// se a pessoa está apta a votar.
// b. Contexto: Essa verificação é necessária para garantir que apenas eleitores aptos
// participem da votação.

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 16) {
            System.out.println("Você está apto a votar.");
        } else if (idade < 0) {
            System.out.println("Idade inválida.");
        } else {
            System.out.println("Você não está apto a votar.");
        }
        input.close();
    }
}
