package misa;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        // Pega o número de linhas e colunas da matriz
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        // Cria a matriz
        int[][] matriz = new int[linhas][colunas];
        // Preenche a matriz com os valores digitados pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Imprime a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}