package secao_10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int quantidade = scanner.nextInt();

        List<Employee> listaEmployees = new ArrayList<>();

        for (int i = 0; i<quantidade; i++) {
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            Long id = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();
            System.out.println();

            listaEmployees.add(new Employee(id, nome, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Employee employeeToIncrease = listaEmployees.stream()
            .filter(x -> x.getId() == scanner.nextLong())
            .findFirst()
            .orElse(null);

        if (employeeToIncrease == null) {
            System.out.println("This employee id does not exist.");
        }
        else {
            System.out.print("Enter the percentage: ");
            double increase = scanner.nextDouble();
            employeeToIncrease.increaseSalary(increase);
        }

        System.out.println("List of employees: ");
        for (Employee funcionario: listaEmployees) {
            System.out.println(funcionario);
        }
    }
}
