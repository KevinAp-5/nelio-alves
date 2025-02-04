package secao_10.exercicios;

import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = scanner.nextInt();

        if (n > 10) {
            n = 10;
        }

        int[] vetorInteiros = new int[n];

        for (int i = 0; i < vetorInteiros.length; i++) {
                System.out.printf("Digite um numero: ");
                vetorInteiros[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int valor: vetorInteiros) {
            if (valor < 0) {
                System.out.println(valor);
            }
        }
    }
}
