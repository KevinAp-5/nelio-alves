package secao_10.exercicios;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números que serão inseridos: ");
        int quantidade = scanner.nextInt();

        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];
        int[] vetorC = new int[quantidade];


        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            int numero = scanner.nextInt();
            vetorB[i] = numero;
            vetorC[i] = numero + vetorA[i];
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }

    }
}
