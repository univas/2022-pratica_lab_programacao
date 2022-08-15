package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(2022);

        long a = 1;
        short b = 1;
        byte c = 1;

        double d = 1.0;
        float e = 1.0f;

        char f = 'R';
        boolean g = true;
        boolean h = false;

        String nome = "Rodrigo";

        int anoAtual = 2022;
        System.out.println(anoAtual);

        int anoNascimento = 1999;
        int idade = anoAtual - anoNascimento;
        System.out.println(idade);

        int resultadoMultiplicacao = anoAtual * anoNascimento;
        int resultadoDivisao = anoAtual / anoNascimento;
        int resultadoSoma = anoAtual + anoNascimento;
        int resultadoRestoDivisao = anoAtual % 2;

        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);
        System.out.println(resultadoSoma);

        int valorA = 10;
        String valorB = "20";

        System.out.println(valorA + valorB + "sda" + anoAtual + "asd");

        // comentario de uma linha
        /*
            comentario
            de
            varias
            linhas
         */
    }
}
