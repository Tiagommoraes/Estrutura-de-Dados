
public class ListaEncadeada {
    private int[] elementos;
    private int tamanho;

    //Criando lista vazia:
    public ListaEncadeada(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }
    //Criando método para inserir no início da lista:
    public void inserirNoInicio (int elemento) {
        if (tamanho < elementos.length) {
            for (int i = tamanho; i > 0; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = elemento;
            tamanho++;
        } else {
            System.out.println("Esta lista está cheia!");
        }
    }
    //Criando método para inseri no final da lista:
    public void inserirNoFim (int elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Esta lista está cheia!");
        }
    }
    //Criando método na posição específica da lista:
    public void inserirNaPosicao (int elemento, int posicao) {
        if (posicao >= 0 && posicao <= tamanho && tamanho < elementos.length) {
            for (int i = tamanho; i > posicao; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[posicao] = elemento;
            tamanho++;
        } else {
            System.out.println("Posição na lista inválida ou cheia!");
        }
    }
    //Criando método para remover no inicio da lista:
    public void removerNoInicio () {
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Esta lista está vazia!");
        }
    }
    //Criando método para remover no final da lista:
    public void removerNoFim () {
        if (tamanho > 0) {
            tamanho--;
        } else {
            System.out.println("Esta lista está vazia!");
        }
    }
    //Criando método para remover na posição específca:
    public void removerNaPosicao (int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Esta posição está inválida!");
        }
    }
    //Criando método para remover elemento da lista:
    public void removerElemento (int elemento) {
        int posicao = buscarElemento (elemento);
        if (posicao != -1) {
            removerNaPosicao(posicao);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
    //Criando método para exibir lista:
    public void exibirLista () {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i] + " ");
        }
        System.out.println();
    }
    /*Criando método para buscar elemento específico na lista e informar caso o elemento
    exista, a posição naqual está armazenada*/
    public int buscarElemento (int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    //Criando método que retorne o número de elementos existentes na lista:
    public int tamanho() {
        return tamanho;
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada(10);

        lista.inserirNoFim(1);
        lista.inserirNoFim(2);
        lista.inserirNoFim(3);
        lista.exibirLista(); //saída 1 2 3
        lista.inserirNoInicio(0);
        lista.exibirLista(); //saída 0 1 2 3
        lista.inserirNaPosicao(4, 2);
        lista.exibirLista(); //saída 0 1 4 2 3
        lista.removerNoInicio();
        lista.exibirLista(); //saida 1 4 2 3
        lista.removerNoFim();
        lista.exibirLista(); //saída 1 4 2
        lista.removerNaPosicao(1);
        lista.exibirLista(); //saída 1 2
        lista.removerElemento(2);
        lista.exibirLista(); //saída 1
        System.out.println("Tamanho a lista: " + lista.tamanho()); //saída: 1
        System.out.println("Posição do elemento: " + lista.buscarElemento(1)); //saída: 0
    }

}