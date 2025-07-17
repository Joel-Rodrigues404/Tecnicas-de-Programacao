// Questão 20:
// a. Enunciado: Um sistema de controle de temperatura precisa verificar se a
// temperatura está dentro de um intervalo seguro. Escreva um pseudocódigo que
// leia a temperatura e determine se ela está entre 20°C e 30°C. O pseudocódigo
// deve exibir uma mensagem indicando se a temperatura está dentro do intervalo
// seguro.
// b. Contexto: Essa verificação é importante para garantir a segurança dos ambientes
// monitorados.

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        float temperatura = input.nextFloat();

        if (temperatura < 20 || temperatura > 30) {
            System.out.println("Temperatura fora do intervalo seguro!");
        } else {
            System.out.println("Temperatura dentro do intervalo seguro.");
        }
        input.close();
    }
}
