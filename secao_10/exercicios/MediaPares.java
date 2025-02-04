package secao_10.exercicios;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números que serão inseridos: ");
        int quantidade = scanner.nextInt();


        int[] vetor = new int[quantidade];


        int mediaPares = 0;
        int quantidadePares = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            vetor[i] = numero;
            if (numero % 2 == 0) {
                mediaPares += numero;
                quantidadePares ++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("Nenhum número par.");
        }
        else {
            System.out.printf("Media dos pares = %.1f %n", (double) mediaPares / quantidadePares);
        }
    }
}
