package br.edu.univas;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] idades = new int[1000];
        int i = 0;
        int contador0A12 = 0;
        int contador13A17 = 0;
        int contador18A60 = 0;
        int contadorAcima60 = 0;

        while (true) {
            System.out.println("Digite a idade:");
            int idade = leitura.nextInt();
            if (idade == -1) {
                break;
            }
            idades[i] = idade;
            i++;

            if (idade <= 12) {
                contador0A12++;
            } else if (idade <= 17) {
                contador13A17++;
            } else if (idade <= 60) {
                contador18A60++;
            } else {
                contadorAcima60++;
            }
        }

        int porcentagem0A12 = contador0A12 * 100 / i;
        int porcentagem13A17 = contador13A17 * 100 / i;
        int porcentagem18A60 = contador18A60 * 100 / i;
        int porcentagemAcima60 = contadorAcima60 * 100 / i;

        System.out.println("Quantidade de pessoas com 0 – 12 anos: " + contador0A12 + " - porcentagem: " + porcentagem0A12);
        System.out.println("Quantidade de pessoas com 13 – 17 anos: " + contador13A17 + " - porcentagem: " + porcentagem13A17);
        System.out.println("Quantidade de pessoas com 18 – 60 anos: " + contador18A60 + " - porcentagem: " + porcentagem18A60);
        System.out.println("Quantidade de pessoas acima de 60 anos: " + contadorAcima60 + " - porcentagem: " + porcentagemAcima60);
    }
}
