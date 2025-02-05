package secao_10.matriz;

import java.util.Scanner;

public class MatrizesExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // Número de colunas
        int y = scanner.nextInt(); // Número de linhas
        int[][] matriz = new int[y][x];
        
        // Populando a matriz
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Número a ser procurado
        int toFind = scanner.nextInt();

        // Percorrendo a matriz para encontrar o número
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (matriz[i][j] == toFind) {
                    System.out.printf("Position %d, %d%n", i, j);
                    
                    // Verifica elemento acima
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    // Verifica elemento à esquerda
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    // Verifica elemento à direita
                    if (j < x - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    // Verifica elemento abaixo
                    if (i < y - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                    System.out.println("---------");
                }
            }
        }

        scanner.close();
    }
}
