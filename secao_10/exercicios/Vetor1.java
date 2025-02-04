package secao_10.exercicios;

import java.util.Scanner;

public class Vetor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor N: ");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        double media = 0;
        for (int i = 0; i < n; i ++) {
            System.out.printf("Digite o valor para o indice %d: ", i);
            vect[i] = scanner.nextDouble();
            media += vect[i];
        }
        System.out.println();

        // double media = 0;
        // for (Double valor: vect) {
        //     media += valor;
        // }
        media /= n;
        System.out.printf("O valor médio dos valores: %.2f%n", media);

    }
}
