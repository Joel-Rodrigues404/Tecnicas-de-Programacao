// Um consultório armazena os nomes dos pacientes conforme eles chegam. Ao
// final do dia, o atendente deseja saber:
// -
// Quantos pacientes chegaram ao todo
// -
// Quantos têm nome com mais de 10 caracteres
// -
// E se um paciente específico (informado ao final) compareceu ou não
// Implemente em Java.
// Dicas: Use ArrayList e o que foi abordado anteriormente.

import java.util.ArrayList;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "";
        ArrayList<String> nomes = new ArrayList<String>();
        int cont = 0;

        while (!(nome.equals("para"))) {
            System.out.print("digite um novo nome: ");
            String nome2 = input.next();
            nome = nome2;

            nomes.add(nome);
            cont = cont + 1;
        }

        int contMaior10 = 0;

        System.out.print("Digite o nome desejado: ");
        String nomeDesejado = input.next();

        for (int i = 0; i < cont; i++) {
            if (nomes.get(i).length() > 10) {
                contMaior10 = contMaior10 + 1;
            }
        }

        int cont2 = 0;
        for (int i = 0; i < cont; i++) {
            if (nomes.get(i).equals(nomeDesejado)) {
                System.out.println("Veio");
                break;
            }
            cont2 = cont2 + 1;
        }

        if (cont == cont2) {
            System.out.println("Não veio");
        }

        System.out.println("mais de 10 caracteres " + contMaior10);

        input.close();
    }
}
