package secao_10.exercicios;

import java.util.Scanner;

import secao_10.exercicios.entities.Product;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = scanner.nextInt();
        Product[] vetorProdutos = new Product[n];
        for (int i = 0; i < vetorProdutos.length; i++ ) {
            scanner.nextLine();
            System.out.printf("Indice %d%n", i);
            System.out.println("Digite o nome do produto: ");
            String name = scanner.nextLine();
            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            vetorProdutos[i] = new Product(name, valor);
            System.out.println("-----------------------");
        }

        double somaValores = 0;
        for (Product produto: vetorProdutos) {
            somaValores += produto.getValue();
        }
        System.out.println();
        System.out.printf("Valor total dos produtos: R$%.2f%n", somaValores);
        System.out.printf("Valor médio do produtos: R$%.2f%n", somaValores / n);

        scanner.close();
    }
}
