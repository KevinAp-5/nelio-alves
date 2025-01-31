package secao_7;

public class Funcoes {

    public static void main(String[] args) {

        System.out.println(maiorNumero(112312312, 30, 1023));
    }

    public static int maiorNumero(int num1, int num2, int num3) {
        int maior = 0;
        if (num1 > num2) {
            maior = num1;
        }
        else {
            maior = num2;
        }

        if (maior < num3) {
            maior = num3;
        }
        return maior;
    }
}
