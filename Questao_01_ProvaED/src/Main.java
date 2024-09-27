/*Crie um programa para armazezar 10 elementos inteiros em um vetor.
Após ler os valores pelo teclado e armazená0los no vetor,
construa um segundo vetor de mesmo tipo e metade do tamanho.
Preencha esse vetor da seguinte forma: a primeira posição deve receber
a soma entre o primeiro e o último elemento do vetor original, a segunda posição receberá
a soma entre o segundo e o penúltimo elemento e assim por diante. Feito isso, mostre na tela o conteúdo
dos dois vetores. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] vetorOriginal = new int[10];
        int[] vetorSoma = new int[5];

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++){
            vetorOriginal[i] = scr.nextInt();
        }
        for (int i = 0; i < 5; i++){
            vetorSoma[i] = vetorOriginal[i] + vetorOriginal[9 - i];
        }
        System.out.println("Vetor Original: ");
        for (int i = 0; i < 10; i++){
            System.out.println(vetorOriginal[i] + " ");
        }
        System.out.println("Vetor Soma: ");
        for (int i = 0; i < 5; i++){
            System.out.println(vetorSoma[i] + " ");
        }
    }
}