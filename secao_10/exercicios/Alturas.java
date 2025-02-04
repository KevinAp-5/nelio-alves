package secao_10.exercicios;

import java.util.Scanner;

import secao_10.exercicios.entities.Pessoa;

public class Alturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas a serem digitadas: ");
        int quantidade = scanner.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[quantidade];

        int quantidadePessoasMenor16 = 0;
        StringBuilder sBuilder = new StringBuilder();
        double alturaMedia = 0;
        for (int i = 0; i < vetorPessoas.length; i++) {
            scanner.nextLine();
            System.out.printf("Dados da %da pessoa%n", i+1);
            System.out.printf("Nome: ");
            String nome = scanner.nextLine();
            System.out.printf("Idade: ");
            int idade = scanner.nextInt();
            System.out.printf("Altura: ");
            double altura = scanner.nextDouble();
            vetorPessoas[i] = new Pessoa(nome, idade, altura);
            alturaMedia += altura;
            if (idade < 16) {
                quantidadePessoasMenor16 += 1;
                sBuilder.append(String.format("%s %n", nome));
            }
        }

        alturaMedia /= vetorPessoas.length;
        System.out.printf("altura média: %.2f %n", alturaMedia);
        double pct = (quantidadePessoasMenor16 / (double) vetorPessoas.length) * 100;

        System.out.printf("Porcentagem de pessoas menor de 16: %.2f %n", pct);
        System.out.println(sBuilder.toString());

        scanner.close();
    }
}
