package br.edu.univas;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int quantidadeNotaMenor30 = 0;
        int quantidadeNotaMenor60 = 0;
        int quantidadeNotaMaior60 = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Digite sua nota:");
            int nota = leitura.nextInt();

            if (nota < 30) {
                quantidadeNotaMenor30++;
            } else if (nota < 60) {
                quantidadeNotaMenor60++;
            } else {
                quantidadeNotaMaior60++;
            }
        }

        float porcentagemNotaMaior60 = quantidadeNotaMaior60 * 100.0f / 50;
        float porcentagemNotaMenor60 = quantidadeNotaMenor60 * 100.0f / 50;
        float porcentagemNotaMenor30 = quantidadeNotaMenor30 * 100.0f / 50;

        System.out.println("Quantidade de alunos que passaram direto: " + quantidadeNotaMaior60 + " porcentagem: " + porcentagemNotaMaior60);
        System.out.println("Quantidade de alunos que estão de recuperação: " + quantidadeNotaMenor60 + " porcentagem: " + porcentagemNotaMenor60);
        System.out.println("Quantidade de alunos de dependência: " + quantidadeNotaMenor30 + " porcentagem: " + porcentagemNotaMenor30);
    }
}
