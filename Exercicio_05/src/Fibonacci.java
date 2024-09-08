//Faça um programa que leia um valor e apresente o número de Fibonacci
//correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da
//série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
//ele. Todos os valores de Fibonacci calculados neste problema devem caber em
//um inteiro de 64 bits sem sinal.

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int n = scn.nextInt();
        scn.close();

        long fibonacci = fibonacci (n);
        System.out.println("O Próximo termo Fibonacci é: " + fibonacci);
    }
    public static long fibonacci (int n ){
        if (n <= 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}