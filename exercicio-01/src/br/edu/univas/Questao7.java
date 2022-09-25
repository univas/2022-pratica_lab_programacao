package br.edu.univas;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float[] vendas = new float[150];

        float menor = 0;
        float maior = 0;
        float total = 0;

        for (int i = 0; i < 150; i++) {
            System.out.println("Digite o valor da venda:");
            vendas[i] = leitura.nextFloat();

            if (i == 0) {
                menor = vendas[i];
                maior = vendas[i];
            } else if (vendas[i] < menor) {
                menor = vendas[i];
            } else if (vendas[i] > maior) {
                maior = vendas[i];
            }

            total += vendas[i];
        }

        float precoMedio = total / 150.0f;
        System.out.println("Menor venda: " + menor);
        System.out.println("Maior venda: " + maior);
        System.out.println("Preço médio das vendas: " + precoMedio);
        System.out.println("Total de vendas: " + total);
    }
}
