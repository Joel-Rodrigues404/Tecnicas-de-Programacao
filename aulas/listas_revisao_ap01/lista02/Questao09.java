// Questão 9:
// a. Enunciado: Um aplicativo de previsão do tempo precisa converter a temperatura
// de Celsius para Fahrenheit para usuários em diferentes regiões. Escreva um
// pseudocódigo que leia uma temperatura em Celsius e a converta para Fahrenheit.
// O pseudocódigo deve exibir a temperatura convertida.
// b. Contexto: A conversão de temperatura é necessária para atender usuários que
// utilizam diferentes unidades de medida.

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = input.nextFloat();

        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        input.close();
    }
}
