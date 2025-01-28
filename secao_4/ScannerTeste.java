import java.util.Locale;
import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String minhaString;
        System.out.print("Digite uma palavra: ");
        minhaString = scanner.next();
        System.out.println(minhaString);
        // scanner.close();
        // --------------------

        int x;
        System.out.println("Digite um número inteiro: ");
        x = scanner.nextInt();
        System.out.println(x);
        // scanner.close();

        // ------------------

        double y;
        System.out.println("Digite um número de ponto flutuante: ");
        y = scanner.nextDouble();
        System.out.println(y);

        // --------------------

        char sexo;
        System.out.println("Digite um caractere: ");
        sexo = scanner.next().charAt(0);
        System.out.println(sexo);

        // --------------
        String nome;
        int idade;
        double salario;
        System.out.println("Digite nome, idade, salario na mesma linha, separados por espaço: ");
        nome = scanner.next();
        idade = scanner.nextInt();
        salario = scanner.nextDouble();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        

        scanner.close(); // fechando o scanner depois de utilizado.
    }
}
