/*01) - Escreva um programa que crie um vetor de números inteiros, receba 10 valores
 informados pelo usuário, imprima todos os valores pares e depois todos os
 valores ímpares.*/



import java.util.Scanner;
public class Vetor{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scn.nextInt();
        }
        System.out.println("Os números pares são: ");
        for (int numero : numeros){
            if (numero % 2 == 0){
                System.out.println(numero + " ");
            }
        }
        System.out.println("Os números ímpares são: ");
        for (int numero : numeros){
            if (numero % 2 != 0){
                System.out.println(numero + " ");
            }
        }
        scn.close();
    }
}