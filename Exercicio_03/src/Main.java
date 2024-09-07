//03)Leia um valor e faça um programa que coloque o valor lido na primeira posição
//de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do
//valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
//devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numero = new int[10];

        System.out.println("Entre com um Valor: ");
        numero [0] = scn.nextInt();

        for (int i = 1; i < 10; i++){
            numero[i] = numero[i - 1] * 2;
        }
        System.out.println("Valor: ");
        for (int i = 0; i < 10; i++){
            System.out.println(numero[i] + " ");
        }
    }
}