package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        String nome = "Rodrigo";
        String[] alunos = new String[5];

        alunos[0] = "Luca";
        alunos[1] = "João";
        alunos[2] = "Renato";
        alunos[3] = "Flávio";
        alunos[4] = "Marcelo";

        System.out.println(alunos[3]);

        for (int i = 0; i < 5; i++) {
            System.out.println(alunos[i]);
        }

        int[] notas = {
                19, 15, 17, 18, 18, 19,
                05, 10, 06, 20, 19, 16,
                14, 8, 7, 19, 05, 10, 06, 17};

        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }

}
