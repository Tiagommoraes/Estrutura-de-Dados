import java.util.NoSuchElementException;

public class FilaEncadeada {
    private static class Nodo {
        int elemento;
        Nodo proximo;

        public Nodo(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void enfileirar(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        if (estaVazia()) {
            inicio = novoNodo;
        } else {
            fim.proximo = novoNodo;
        }
        fim = novoNodo;
        tamanho++;
    }

    public int desenfileirar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        int elemento = inicio.elemento;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
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
        return inicio.elemento;
    }

    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();

        fila.enfileirar(25);
        fila.enfileirar(15);
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
