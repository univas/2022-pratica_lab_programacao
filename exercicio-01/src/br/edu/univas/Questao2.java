package br.edu.univas;

public class Questao2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println("Par e divisível por 3: " + i);
                }
                if (i % 4 == 0) {
                    System.out.println("Par e divisível por 4: " + i);
                }

            } else {
                if (i % 3 == 0) {
                    System.out.println("Ímpar e divisível por 3: " + i);
                }
                if (i % 4 == 0) {
                    System.out.println("Ímpar e divisível por 4: " + i);
                }
            }
        }
    }
}
