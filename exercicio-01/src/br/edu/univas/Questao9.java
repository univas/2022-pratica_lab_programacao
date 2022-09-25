package br.edu.univas;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float receitaTotal = 0;
        float despesaTotal = 0;

        while (true) {
            System.out.println("Digite o tipo de conta:");
            int tipoConta = leitura.nextInt();

            if (tipoConta == 0) {
                break;
            }

            System.out.println("Digite o valor da conta:");
            float valorConta = leitura.nextFloat();

            if (tipoConta == 1) {
                receitaTotal += valorConta;
            } else {
                despesaTotal += valorConta;
            }
        }

        float saldoFinal = receitaTotal - despesaTotal;
        if (saldoFinal < 0) {
            System.out.println("Saldo final negativo de: " + saldoFinal);
        } else {
            System.out.println("Saldo final positivo de: " + saldoFinal);
        }
    }
}
