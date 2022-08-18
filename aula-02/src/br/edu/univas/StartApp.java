package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        int idade = 27;

        if (idade > 15) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }

        int idade2 = 17;
        if (idade2 <= 15) {
            System.out.println("Você não pode votar!");
        } else if (idade2 < 18) {
            System.out.println("Você pode votar!");
        } else if (idade2 < 66) {
            System.out.println("Você é obrigado a votar!");
        } else {
            System.out.println("Você pode votar!");
        }
    }

}
