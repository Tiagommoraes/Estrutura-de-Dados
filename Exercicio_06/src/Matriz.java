//06) - Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros
//informados pelo usuário. Depois, calcule e mostre na tela o determinante da
//matriz.

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        System.out.println("Entre com os números da matriz: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scn.nextInt();
            }
        }
        int determinante = calcularDeterminante(matriz);
        System.out.println("O determinante da matriz é: " + determinante);
    }
    public static int calcularDeterminante(int[][] matriz){
        int determinante = 0;
        for (int i = 0; i < 3; i++){
            determinante += matriz[0][i] * calcularCofator(matriz, 0, i);
        }
        return determinante;
    }
    public static int calcularCofator(int[][] matriz, int linha, int coluna){
        int[][] subMatriz = new int[2][2];
        int linhaSubMatriz = 0;
        for (int i = 0; i < 3; i++){
            if (i != linha){
                int colunaSubMatriz = 0;
                for (int j = 0; j < 3; j++){
                    if (j != coluna){
                        subMatriz[linhaSubMatriz][colunaSubMatriz] = matriz[i][j];
                        colunaSubMatriz++;
                    }
                }
                linhaSubMatriz++;
            }
        }
        return calcularDeterminante2x2(subMatriz);
    }
    public static int calcularDeterminante2x2(int[][] matriz){
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }
}