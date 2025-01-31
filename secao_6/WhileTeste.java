import java.util.Scanner;

public class WhileTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro até 10:");
        int valor = scanner.nextInt();

        while (valor < 10) {
            System.out.println("valor: " + valor);
            valor += 1;
        }
    }
}
