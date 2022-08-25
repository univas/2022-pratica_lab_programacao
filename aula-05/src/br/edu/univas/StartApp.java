package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome, por favor:");
        String nome = leitura.nextLine();

        System.out.println("Digite o ano de nascimento, por favor:");
        int anoNascimento = leitura.nextInt();
        int idade = 2022 - anoNascimento;

        System.out.println(nome + " você tem " + idade + " anos");

        leitura.close();
    }

}
