/*01)-Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores, carregue um terceiro vetor onde o valor
de cada elemento será a média dos elementos de mesmo índice nos dois vetores anteriores.*/

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] Vet1 = new int[10];
        int[] Vet2 = new int[10];
        double[] VetMedia = new double[10];

        System.out.println("Digite 10 números para o vetor 1: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Elemento " + (i + 1) + ": ");
            Vet1[i] = scn.nextInt();
        }
        System.out.println("Digite 10 números para o vetor 2: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Elemento " + (i + 1) + ": ");
            Vet2[i] = scn.nextInt();
        }
        //Calculando a média.
        for (int i = 0; i < 10; i++){
            VetMedia[i] = (Vet1[i] + Vet2[i] / 2.0);
        }
        //Exibindo a média.
        System.out.println("Média dos vetores: ");
        for (int i = 0; i < 10; i++){
            System.out.printf("Posição %d: %.2f\n", i, VetMedia[i]);
        }
        scn.close();
    }
}

