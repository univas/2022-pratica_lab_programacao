package br.edu.univas;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] valores = new int[25];
        for (int i = 0; i < 25; i++) {
            valores[i] = leitura.nextInt();
        }

        for (int i = 0; i < 25; i++) {
            if (valores[i] < 0) {
                valores[i] = 0;
            }
        }

        for (int i = 0; i < 25; i++) {
            System.out.print(valores[i]);
            if (i < 24) {
                System.out.print(" - ");
            }
        }
    }
}
