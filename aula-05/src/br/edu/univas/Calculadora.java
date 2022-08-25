package br.edu.univas;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite um número:");
        int a = leitura.nextInt();

        System.out.println("Por favor, digite o próximo número:");
        int b = leitura.nextInt();

        int soma = a + b;
        System.out.println("A soma foi: " + soma);
    }
}
