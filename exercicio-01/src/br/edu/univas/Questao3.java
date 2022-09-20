package br.edu.univas;

public class Questao3 {

    public static void main(String[] args) {
        int min = 5;
        int max = 15;
        for (int i = min; i <= max; i++) {
            System.out.print("\t" + i);
        }

        for (int i = min; i <= max; i++) {
            System.out.print("\n" + i);
            for (int j = min; j <= max; j++) {
                int aux = i * j;
                System.out.print("\t" + aux);
            }
        }
    }
}
