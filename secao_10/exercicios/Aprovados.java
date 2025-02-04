package secao_10.exercicios;

import java.util.List;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de alunos: ");
        int quantidade = scanner.nextInt();

        String[] vetorNomes = new String[quantidade];
        // double[] vetorNota1 = new double[quantidade];
        // double[] vetorNota2 = new double[quantidade];

        // double[] vetorMediaNota = new double[quantidade];
        String[] nomeAprovado = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Dados dao %do aluno%n", i + 1);
            scanner.nextLine();
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            vetorNomes[i] = nome;
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            // vetorNota1[i] = nota1; 
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            // vetorNota2[i] = nota2;
            // double media = vetorMediaNota[i] = (vetorNota1[i] + vetorNota2[i]) / 2;
            double media = (nota1 + nota2) / 2;

            if (media >= 6.0)
                nomeAprovado[i] = nome;

        }

        // double[] vetorMediaNota = new double[quantidade];
        // for (int i = 0; i < quantidade; i++) {
        //     vetorMediaNota[i] = (vetorNota1[i] + vetorNota2[i]) / 2;
        // }

        System.out.println("Alunos aprovados: ");
        for (String nome: nomeAprovado) {
            if (nome != null)
                System.out.println(nome);
        }
        // for (int i = 0; i < quantidade; i++) {
        //     double nota = vetorMediaNota[i];
        //     if (nota >= 6.0) {
        //         System.out.println(vetorNomes[i]);
        //     }
        // }
    }
}
