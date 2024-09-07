//Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
//armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
//outros vetores, mostre na tela a média dos valores armazenados no vetor
//ponderados pelos índices nos quais estão armazenados.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] num = new int[10];
        int soma = 0;
        int peso = 0;

        for (int i = 0; i < 10; i ++){
            System.out.println("Entre com seus números: " + (i + 1) + ": ");
            num[i] = scn.nextInt();
        }
        for (int i = 0; i < 10; i ++){
            soma += num[i] * i;
            peso += i;
        }
        double mediaPonderada = (double) soma / peso;
        System.out.println("Média: " + mediaPonderada);
    }
}
