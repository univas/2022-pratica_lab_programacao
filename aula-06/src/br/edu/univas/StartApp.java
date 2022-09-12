package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro número:");
        int a = leitura.nextInt();
        System.out.println("Por favor digite o segundo número:");
        int b = leitura.nextInt();
        System.out.println("Por favor digite o terceiro número:");
        int c = leitura.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A é o maior número!");
            } else {
                System.out.println("C é o maior número!");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("B é o maior número!");
            } else {
                System.out.println("C é o maior número!");
            }
        }

    }

}
