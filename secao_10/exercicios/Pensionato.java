package secao_10.exercicios;

import java.util.Scanner;

import secao_10.exercicios.entities.Aluno;

public class Pensionato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de quartos: ");
        int quantidade = scanner.nextInt();

        Aluno[] alunos = new Aluno[10];
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Rent  %d#: %n", i + 1);
            scanner.nextLine();
            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Room: ");
            int quarto = scanner.nextInt() -1;

            alunos[quarto] = new Aluno(nome, email);
        }

        System.out.println("Alugueis: ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.printf("%d, %s, %s %n", i + 1, alunos[i].getNome(), alunos[i].getEmail());

            }
        }
    }

}
