//04) - Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100
//posições. Em cada posição subsequente de N (1 até 99), coloque a metade do
//valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
//vetor N.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double [] vetor = new double[100];

        System.out.println("Entre com um valor: ");
        vetor[0] = scn.nextDouble();

        for (int i = 1; i < 100; i++){
            vetor[i] = vetor[i - 1] / 2;
        }
        System.out.println("Vetor de: ");
        for (int i = 0; i < 100; i++){
            System.out.println(vetor[i] + " ");
        }
    }
}