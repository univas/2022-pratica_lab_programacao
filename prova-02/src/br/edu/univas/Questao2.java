package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] empregados = new int[50];

        int estag = 0;
        int devJunior = 0;
        int devPleno = 0;
        int devSenior = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Por favor, digite o cargo do colaborador:");
            empregados[i] = leitura.nextInt();

            if (empregados[i] == 1) {
                estag++;
            } else if (empregados[i] == 2) {
                devJunior++;
            } else if (empregados[i] == 3) {
                devPleno++;
            } else {
                devSenior++;
            }
        }

        int porcentagemEstag = estag * 100 / 50;
        int porcentagemDevJunior = devJunior * 100 / 50;
        int porcentagemDevPleno = devPleno * 100 / 50;
        int porcentagemDevSenior = devSenior * 100 / 50;

        System.out.println("Número de estagiários: " +
                estag + " - corresponde a " +
                porcentagemEstag + "% do total");
        System.out.println("Número de dev junior: " +
                devJunior + " - corresponde a " +
                porcentagemDevJunior + "% do total");
        System.out.println("Número de dev pleno: " +
                devPleno + " - corresponde a " +
                porcentagemDevPleno + "% do total");
        System.out.println("Número de dev sênior: " +
                devSenior + " - corresponde a " +
                porcentagemDevSenior + "% do total");
    }
}
