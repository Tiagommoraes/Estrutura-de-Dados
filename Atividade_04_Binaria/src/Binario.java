/*04) - Escreva um programa que ordene um vetor de tamanho
arbitrário preenchido com números aleatórios e execute a 
pesquisa por um valorpassado como parâmetro utilizando o 
algoritmo da busca binária.*/
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();
        //Tamnho do Vetor.
        System.out.println("Entre com o tamanho do vetor: ");
        int tamanho = scn.nextInt();

        int[] Vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++){
            Vetor[i] = rdm.nextInt(100);//Números Aleatórios.
        }
        //Ordenando.
        Arrays.sort(Vetor);
        System.out.println("Vetor ordenado: " + Arrays.toString(Vetor));

        //Solicitando a busca.
        System.out.println("Entre com o valor da busca: ");
        int valorBusca = scn.nextInt();

        //Realizando a busca binária.
        int resultado = Arrays.binarySearch(Vetor, valorBusca);

        //Exibição do resultado.
        if (resultado >= 0){
            System.out.println("Número encontrado na posição: " + resultado);
        } else {
            System.out.println("Número não localizado no vetor. ");
        }
        scn.close();

    }
}
