package br.edu.univas;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            int numero = leitura.nextInt();
            if (i == 0) {
                maior = numero;
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
