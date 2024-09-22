/*05) - Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam
durante a ordenação de:
a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.
*/
//obs.: boa parte do código construido com ajuda da IA, não conmseguir resolver só, desculpa.
import java.util.Arrays;
import java.util.Random;
public class Ordenacao {
    public static void main(String[] args) {
        int[] VetAleatorio = criarVetorAleatorio(100);
        int[] VetDecrescente = criarVetorDecrescente(100);

        System.out.println("Vetor Aleatório: ");
        compararAlgoritmos(VetAleatorio);

        System.out.println("Vetor Decrescente: ");
        compararAlgoritmos(VetDecrescente);
    }
    public static int[] criarVetorAleatorio(int tamanho){
        int[] Vetor = new int[tamanho];
        Random rdm = new Random();
        for (int i = 0; i < tamanho; i++){
            Vetor[i] = rdm.nextInt(100) + 1;
        }
        return Vetor;
    }
    public static int[] criarVetorDecrescente(int tamanho){
        int[] Vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++){
            Vetor[i] = tamanho - 1;
        }
        return Vetor;
    }
    public static void compararAlgoritmos(int[] vetor) {
        int[] vetorBubble = Arrays.copyOf(vetor, vetor.length);
        int[] vetorSelection = Arrays.copyOf(vetor, vetor.length);

        int trocasBubble = bubbleSort(vetorBubble);
        int trocasSelection = selectionSort(vetorSelection);

        System.out.println("Bubble Sort: " + trocasBubble + " trocas");
        System.out.println("Selection Sort: " + trocasSelection + " trocas");
    }
    public static int bubbleSort(int[] vetor){
        int trocas = 0;
        for (int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - i - 1; j++){
                if (vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                }
            }
        }
        return trocas;
    }
    public static int selectionSort(int[] vetor){
        int trocas = 0;
        for (int i = 0; i < vetor.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocas++;
            }
        }
        return trocas;
    }
}