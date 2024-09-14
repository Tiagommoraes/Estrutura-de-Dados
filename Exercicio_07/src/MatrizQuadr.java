/*Escreva um programa que receba um número inteiro 2 ≤ 𝑁 ≤ 5, crie uma
matriz quadrada 𝑁 × 𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
quadrado da matriz criada e exiba o resultado na tela.*/

import java.util.Scanner;

public class MatrizQuadr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre com um número inteiro entre 2 e 5: ");
        int N = scn.nextInt();
        scn.close();

        if (N < 2 || N > 5) {
            System.out.println("Você digitou um número inválido. Entre com um número ENTRE 2 e 5:");
            return;
        }
        //Preenchendo a matriz:
        int[][] matriz = new int[N][N];
        int valor = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }
        //Exibindo a Matriz:
        System.out.println("Matriz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //Calculando o Quadrado da Matriz:
        int[][] matrizQuadrado = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrizQuadrado[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }
        //Exibindo o Quadrado da matriz:
        System.out.println("O quadrado da matriz é: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(matrizQuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}