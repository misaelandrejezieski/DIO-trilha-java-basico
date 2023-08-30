import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try 
        (Scanner scanner = new Scanner(System.in)) {
            // Pega o número de linhas e colunas da matriz
            System.out.println("Digite o número de linhas: " );
            int linhas = scanner.nextInt();
            System.out.println("Digite o número de colunas: " );
            int colunas = scanner.nextInt();
            System.out.println("--Digite o número para preencher o array: " );
            // Cria a matriz
           
            int[][] matriz = new int[linhas][colunas];
        // Preenche a matriz com os valores digitados pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o número: " );
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Imprime a matriz
        System.out.println("Imprimindo o array com " + linhas + " linhas e " + colunas + " colunas." );
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
    
}