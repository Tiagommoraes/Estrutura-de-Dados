/*03) - Escreva um programa que carregue dois vetores
inteiros com 5 posições, sendo um com números pares e 
o outro com números ímpares. O usuário pode digitar os 
números em qualquer sequência e o programa deverá armazená-los
no vetor correto na ordem em que foram informados pelo usuário.*/
import java.util.Scanner;
public class VetParImpar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] VetPar = new int[5];
        int[] VetImpar = new int[5];
        int ContPar = 0;
        int ContImpar = 0;

        System.out.println("Digite 10 números inteiros: ");
        while (ContPar + ContImpar < 10){
            System.out.println("Entre com um número: ");
            int numero = scn.nextInt();

            if (numero % 2 == 0) {
                if (ContPar < 5){
                    VetPar[ContPar] = numero;
                    ContPar++;
                } else {
                    System.out.println("Vetor par cheio, Ignorado vair ser este número.");
                }
            } else{
                if (ContImpar < 5){
                    VetImpar[ContImpar] = numero;
                    ContImpar++;
                } else {
                    System.out.println("Vetor ímpar cheio, Ignorado vair ser este número.");
                }
            }
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < ContPar; i++){
            System.out.println(VetPar[i] + " ");
        }
        System.out.println("Números ímpares: ");
        for (int i = 0; i < ContImpar; i++){
            System.out.println(VetImpar[i] + " ");
        }
        scn.close();
    }
}
