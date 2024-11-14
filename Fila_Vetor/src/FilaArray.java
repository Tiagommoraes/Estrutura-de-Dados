import java.util.NoSuchElementException;

public class FilaArray {
    private int[] elementos;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enfileirar(int elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Fila cheia");
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    public int desenfileirar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        int elemento = elementos[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int primeiro() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return elementos[inicio];
    }

    public static void main(String[] args) {
        FilaArray fila = new FilaArray(5);

        fila.enfileirar(9);
        fila.enfileirar(5);
        fila.enfileirar(8);

        System.out.println("Primeiro elemento: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("Removendo: " + fila.desenfileirar());
        System.out.println("Primeiro elemento agora: " + fila.primeiro());
        System.out.println("Tamanho da fila após remoção: " + fila.tamanho());

        fila.enfileirar(40);
        fila.enfileirar(50);
        System.out.println("Tamanho final da fila: " + fila.tamanho());
    }
}
