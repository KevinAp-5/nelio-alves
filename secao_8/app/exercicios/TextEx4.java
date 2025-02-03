package secao_8.app.exercicios;

import java.util.Scanner;

public class TextEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da cotação atual do dolar: ");
        double dolarPrice = scanner.nextDouble();
        System.out.print("Digite a quantidade de dolares que deseja comprar: ");
        double dolarQuantity = scanner.nextDouble();

        System.out.print("Total dos dolares a ser pago em reais = R$");
        System.out.printf("%.2f%n", Ex4.calculaDolar(dolarPrice, dolarQuantity));

        scanner.close();
    }
}
