/*08) - Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer.
Seu programa deve determinar se é possível executar a multiplicação, e mostrar
o resultado do cálculo para os casos possíveis. Quando não for possível efetuar a
operação, uma mensagem deve ser exibida na tela.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Entre com a quantidade de linhas da matriz A: ");
        int linhasA = scn.nextInt();
        System.out.println("Entre com a quantidade de colunas da matriz A: ");
        int colunasA = scn.nextInt();
        System.out.println("Entre com a quantidade de linhas da matriz B: ");
        int linhasB = scn.nextInt();
        System.out.println("Entre com a quantidade de colunas da matriz B: ");
        int colunasB = scn.nextInt();

        if (colunasA != linhasB){
            System.out.println("Essa multiplicação não é possível executar. ");
            return;
        }
        //Criando matrizes:
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];

        //Solicitando valores:
        System.out.println("Entre com os valores da matriz A: ");
        for (int i = 0; i < linhasA; i++){
            for (int j = 0; j < colunasA; j++){
                System.out.println("Componente [" + (i + 1) + "," + (j + 1) + "]: ");
                matrizA[i][j] = scn.nextInt();
            }
        }
        System.out.println("Entre com os valores da matriz B: ");
        for (int i = 0; i < linhasB; i++){
            for (int j = 0; j < colunasB; j++){
                System.out.println("Componente [" + (i + 1) + "," + (j + 1) + "]: ");
                matrizB[i][j] = scn.nextInt();
            }
        }
        //Calculando a multiplicação das matrizes:
        int[][] matrizC = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++){
            for (int j = 0; j < colunasB; j++){
                for (int k = 0; k < colunasA; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];

                }
            }
        }
        //REsultado da multiplicação:
        System.out.println("O resultado da multiplicação é: ");
        for (int i = 0; i < linhasA; i++){
            for (int j = 0; j < colunasB; j++){
                System.out.println(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}