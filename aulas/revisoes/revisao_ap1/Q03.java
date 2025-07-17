// Em uma pesquisa populacional, deseja-se classificar as idades dos habitantes
// em 3 categorias:
// - Criança: até 12 anos
// - Adolescente: de 13 a 17 anos
// - Adulto: 18 anos ou mais
// Escreva um algoritmo em Java que leia 20 idades e 
// imprima(mostre)a quantidade de
// pessoas em 
// cada categoria.

// package revisao_ap1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adulto = 0;
        int crinca = 0;
        int adolescente = 0;

        for (int i = 0; i < 5; i++) {
            int idade = input.nextInt();

            if (idade >= 18) {
                adulto = adulto + 1;
            } else if (idade <= 12) {
                crinca = crinca + 1;
            } else {
                adolescente = adolescente + 1;
            }
        }

        System.out.println("quantidade de adultos " + adulto);
        System.out.println("quantidade de crianças " + crinca);
        System.out.println("quantidade de adolescente " + adolescente);

        input.close();
    }
}
