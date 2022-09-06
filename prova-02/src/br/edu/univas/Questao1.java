package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] angulos = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor digite o próximo ângulo:");
            angulos[i] = leitura.nextInt();
        }

        for (int i = 0; i < 19; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (angulos[i] + angulos[j] == 90) {
                    System.out.println(angulos[i] +
                            " + " + angulos[j] +
                            " = 90");
                }
            }
        }
    }
}
