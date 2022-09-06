package br.edu.univas;

public class Questao1 {

    public static void main(String[] args) {

        int number = 17;

        while (true) {
            if (number % 11 == 0 &&
                    number % 13 == 0 &&
                    number % 17 == 0) {
                break;
            }
            number++;
        }

        System.out.println("O número é: " + number);
    }
}
