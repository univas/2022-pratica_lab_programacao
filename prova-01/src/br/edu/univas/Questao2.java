package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] resultadoJogos = new int[20];
        int numeroDerrotas = 0;
        int numeroEmpates = 0;
        int numeroVitorias = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor, digite o próximo número:");
            resultadoJogos[i] = leitura.nextInt();

            if (resultadoJogos[i] == -1) {
                numeroDerrotas++;
            } else if (resultadoJogos[i] == 0) {
                numeroEmpates++;
            } else {
                numeroVitorias++;
            }
        }

        System.out.println("Resultado final:");
        System.out.println("Derrotas: " + numeroDerrotas);
        System.out.println("Empates: " + numeroEmpates);
        System.out.println("Vitórias: " + numeroVitorias);
    }
}
