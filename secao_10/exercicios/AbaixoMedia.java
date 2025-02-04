package secao_10.exercicios;

import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números que serão inseridos: ");
        int quantidade = scanner.nextInt();


        double[] vetor = new double[quantidade];
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            vetor[i] = numero;
            media += numero;
        }

        media /= quantidade;
        System.out.println("Media do vetor = " + media);
        System.out.println("Valores abaixo da média");
        for (double valor: vetor) {
            if (valor < media) {
                System.out.printf("%.1f %n", valor);
            }
        }
    }
}
