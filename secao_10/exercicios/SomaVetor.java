package secao_10.exercicios;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = scanner.nextInt();

        double[] vetorReais = new double[n];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Digite um número real: ");
            vetorReais[i] = scanner.nextDouble();
        }

        double sum = 0;
        StringBuilder sbValores = new StringBuilder();
       for(double valor: vetorReais) {
            sbValores.append(valor + " ");
            sum += valor;
        }

        System.out.printf("Valores: %s%n", sbValores.toString());
        System.out.println("Soma: " + sum);
        System.out.printf("Média: %.2f%n", sum / vetorReais.length);
    }
}
