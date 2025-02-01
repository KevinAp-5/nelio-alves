package secao_8.app.exercicios;

import java.util.Scanner;

public class TexteEx1 {

    public static void main(String[] args) {
        Ex1 retangulo = new Ex1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the width: ");
        retangulo.width = scanner.nextDouble();

        System.out.println("Insert the Height: ");
        retangulo.height = scanner.nextDouble();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro = %.2f%n", retangulo.perimeter());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
    }

}
