/*02) - Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado
apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores de um novo vetor
com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor
original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante.*/

import java.util.Random;
public class VetorOperacoes {
    public static void main(String[] args) {
        Random random = new Random();
        int[] VetOriginal = new int[100];
        int[] VetNovo = new int[50];

        //Preenchendo vetor original.
        for (int i = 0; i < VetOriginal.length; i++){
            VetOriginal[i] = random.nextInt(101);
        }
        int ValorMenor = VetOriginal[0];
        int PosicaoMenor = 0;
        int Soma = 0;

        //Percorrendo vetor original.
        for (int i = 0; i < VetOriginal.length; i++){
            //Verificando o menor valor.
            if (VetOriginal[i] < ValorMenor){
                ValorMenor = VetOriginal[i];
                PosicaoMenor = i;
            }
            //Somando os VAlores.
            Soma += VetOriginal[i];

            //Novo Vetor.
            if (i < VetNovo.length){
                VetNovo[i] = VetOriginal[i] + VetOriginal[VetOriginal.length - 1 - i];
            }
        }
        //Imprimindo Resultados.
        System.out.println("Posição do menor valor: " + PosicaoMenor);
        System.out.println("Soma de Todos os números: " + Soma);

        System.out.println("Novo vetor:");
        for (int i = 0; i < VetNovo.length; i++) {
            System.out.println("Posição " + i + ": " + VetNovo[i]);
        }
    }
}