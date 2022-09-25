package br.edu.univas;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int contadorFaixaImcNormal = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite seu peso:");
            float peso = leitura.nextFloat();
            System.out.println("Digite sua altura:");
            float altura = leitura.nextFloat();

            float imc = peso / (altura * altura);
            if (imc >= 18.5f && imc <= 24.9f) {
                contadorFaixaImcNormal++;
            }
        }

        System.out.println("A porcentagem de pessoas que estão na faixa de IMC considerada normal é: " + contadorFaixaImcNormal);
    }
}
