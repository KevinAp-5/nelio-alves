package secao_10.exercicios;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números que serão inseridos: ");
        int quantidade = scanner.nextInt();

        double[] valorReais = new double[quantidade];

        // Todos esses problemas é possível resolver com apenas um laço para ter maior eficiencia de Big O
        for (int i = 0; i < valorReais.length; i++ ) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            valorReais[i] = numero;
        }

        double maiorNumero = 0;
        int posicaoMaiorNumero = 0;
        for (int i = 0; i < valorReais.length; i++) {
            double numero = valorReais[i];
            if (numero > maiorNumero) {
                maiorNumero = numero;
                posicaoMaiorNumero = i;
            }
        }

        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Posição do maior valor: " + posicaoMaiorNumero);
    }
}
