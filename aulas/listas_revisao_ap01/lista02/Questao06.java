// Questão 6:
// a. Enunciado: Um programa de matemática educativa deseja calcular a soma dos
// primeiros 100 números naturais para ensinar aos alunos. Escreva um
// pseudocódigo que calcule a soma dos números de 1 a 100. O pseudocódigo
// deve exibir a soma calculada.
// b. Contexto: Esse cálculo será utilizado em uma aula de matemática para
// demonstrar a soma de uma sequência de números.

public class Questao06 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.printf("A soma dos números de 1 a 100 é: %d\n", soma);

    }
}
