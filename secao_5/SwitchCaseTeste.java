import java.util.Scanner;

public class SwitchCaseTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        System.out.print("Digite um número que vai representar um dia da semana: ");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo pé de caximbo");
                break;
            default:
                System.out.println("Dia da semana inválido: " + dia);
                break;
        }
    }
}
