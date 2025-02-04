package secao_10.exercicios;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de Números: ");
        int quantidade = scanner.nextInt();

        int[] vetorInteiros = new int[quantidade];

        int[] numerosPares;
        int quantidadePares = 0;
        for (int i = 0; i < vetorInteiros.length; i ++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            vetorInteiros[i] = numero;
            if (numero % 2 == 0) {
                quantidadePares += 1;
            }
        }

        numerosPares = new int[quantidadePares];

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vetorInteiros.length; i++) {
            int numero = vetorInteiros[i];
            if (numero % 2 == 0) {
                numerosPares[counter] = numero;
                sb.append(numero + " ");
                counter ++;
            }
        }

        System.out.println("Numeros pares: ");
        System.out.println(sb.toString());
        System.out.println("Quantidade de pares: " + quantidadePares);
    }
}
