package secao_8.app.exercicios;

import java.util.Scanner;

public class TesteEx2 {
    public static void main(String[] args) {
        Ex2 funcionario = new Ex2();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        funcionario.name = scanner.next();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println("Employee: " + funcionario.name + ", " + "$ " + funcionario.netSalary());

        System.out.print("Which percentage to increase salary: ");
        funcionario.increaseSalary(scanner.nextDouble());

        System.out.println("Updated data: " + funcionario.name + ", " + "$ " + funcionario.netSalary());
    }
}
