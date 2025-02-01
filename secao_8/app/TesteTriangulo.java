package secao_8.app;

import java.util.Locale;
import java.util.Scanner;

public class TesteTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double xA, xB, xC, yA, yB, yC;

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre os valores do triangulo x:");
        Scanner scanner = new Scanner(System.in);
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre os valores do triangulo y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        // Sem a OO estavamos usando cada uma das variaveis declaradas acima
        double areaX = x.calculaArea(); 


        double areaY = y.calculaArea();

        System.out.printf("Área do triangulo x: %.4f%n", areaX);
        System.out.printf("Área do triangulo y: %.4f%n", areaY);
        scanner.close();

    }
}
