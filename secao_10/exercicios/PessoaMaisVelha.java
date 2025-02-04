package secao_10.exercicios;

import java.util.Scanner;

public class PessoaMaisVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantide de números de pessoas: ");
        int quantidade = scanner.nextInt();

        String[] vetorNomes = new String[quantidade];
        int[] vetorIdades = new int[quantidade];

        for (int i = 0; i < quantidade; i ++) {
            System.out.printf("Dados da %da pessoa%n", i+1);
            scanner.nextLine();
            System.out.print("Digite o nome: ");
            vetorNomes[i] = scanner.nextLine();
            System.out.print("Digite a idade: ");
            vetorIdades[i] = scanner.nextInt();
        }
 
        int indiceMaisVelho = 0;
        int maiorIdade = 0;
        for (int i = 0; i < vetorIdades.length; i++) {
            int idade = vetorIdades[i];
            if (idade > maiorIdade) {
                maiorIdade = idade;
                indiceMaisVelho = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s %n", vetorNomes[indiceMaisVelho]);
    }
}
