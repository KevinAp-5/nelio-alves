package secao_8.app.exercicios;

import java.util.Scanner;

public class TexteEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex3 aluno = new Ex3();
        aluno.name = scanner.nextLine();
        aluno.nota1 = scanner.nextDouble();
        aluno.nota2 = scanner.nextDouble();
        aluno.nota3 = scanner.nextDouble();

        aluno.finalGrade();
    }
}
