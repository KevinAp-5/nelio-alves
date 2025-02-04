package secao_10.exercicios;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números de pessoas: ");
        int quantidade = scanner.nextInt();

        double maiorAltura = 0;
        double menorAltura = 10;

        double alturaMediaMulheres = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Dados da %da pessoa%n", i + 1);
            scanner.nextLine();
            System.out.printf("altura da %da pessoa%n", i + 1);
            double altura = scanner.nextDouble();

            System.out.printf("Genero da %da pessoa%n", i + 1);
            char genero = scanner.next().toUpperCase().charAt(0);

            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (genero == 'H') {
                quantidadeHomens ++;
            }
            else {
                quantidadeMulheres ++;
                alturaMediaMulheres += altura;
            }
        }

        if (quantidadeMulheres != 0) {
            alturaMediaMulheres /= quantidadeMulheres;
        }
        else {
            alturaMediaMulheres = 0;
        }
        System.out.printf("Altura media das mulheres: %.2f", alturaMediaMulheres);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura:" + maiorAltura);
        System.out.println("Quantidade de homens: " + quantidadeHomens);

    }
}
