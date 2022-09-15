package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número:");
        int a = leitura.nextInt();
        System.out.println("Por favor, digite o segundo número:");
        int b = leitura.nextInt();
        System.out.println("Por favor, digite o terceiro número:");
        int c = leitura.nextInt();

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
