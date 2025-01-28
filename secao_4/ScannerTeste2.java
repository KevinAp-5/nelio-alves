import java.util.Locale;
import java.util.Scanner;

public class ScannerTeste2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String frase1;
        System.out.println("Digite uma frase: ");
        frase1 = scanner.nextLine();

        System.out.println("Sua frase: " + frase1);

        scanner.close();
    }
}
