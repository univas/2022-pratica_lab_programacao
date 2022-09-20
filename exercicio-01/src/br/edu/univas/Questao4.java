package br.edu.univas;

public class Questao4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print("\t");
                if (j <= i) {
                    System.out.print(j);
                }
            }

            for (int j = 2; j <= 5; j++) {
                System.out.print("\t");
                if (j <= i) {
                    System.out.print(j);
                }
            }

            System.out.println("");
        }
    }

}
