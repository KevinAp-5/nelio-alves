package secao_9.exercicio;

import java.util.Scanner;

public class TesteContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o numéro da conta: ");
        String numeroConta = scanner.next();
        System.out.println("Deseja fazer um depósito inicial?(S/N): ");
        String depositoOpcional = scanner.next().trim().toLowerCase();
        ContaBancaria conta1;
        if ("n".equals(depositoOpcional)) {
            conta1 = new ContaBancaria(nome, numeroConta);
            System.out.println(conta1.statusConta());
        }
        else {
            System.out.println("Valor do depósito inicial da conta: ");
            double deposito = scanner.nextDouble();
            conta1 = new ContaBancaria(nome, numeroConta, deposito);
            System.out.println(conta1.statusConta());
        }

        System.out.println("Digite o valor de deposito na conta: ");
        conta1.deposito(scanner.nextDouble());
        System.out.println(conta1.statusConta());

        System.out.println("Digite o valor de saque na conta: ");
        conta1.saque(scanner.nextDouble());
        System.out.println(conta1.statusConta());
        scanner.close();
    }
}
