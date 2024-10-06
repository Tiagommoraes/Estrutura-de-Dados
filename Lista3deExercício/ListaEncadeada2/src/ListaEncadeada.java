/*Lista de exercícios 03 – Estruturas de Dados
1. Implemente a classe ListaEncadeada para armazenar valores inteiros referências
para ligar os elementos da lista.
2. Crie um método para criar uma lista vazia.
3. Crie um método responsável por inserir um elemento no início da lista.
4. Crie um método responsável por inserir um elemento no fim da lista.
5. Crie um método responsável por inserir um elemento em uma posição específica
da lista.
6. Crie um método responsável por remover um elemento no início da lista.
7. Crie um método responsável por remover um elemento no fim da lista.
8. Crie um método responsável por remover um elemento em uma posição
específica da lista.
9. Crie um método responsável por remover um elemento específico da lista.
10. Crie um método para exibir o conteúdo de uma lista.
11. Crie um método para pesquisar por um elemento específico em uma lista e
informar, caso o elemento exista, a posição na qual ele está armazenado.
12. Crie um método que retorne o número de elementos existentes na lista.
*/

public class ListaEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    //Criando Lista Vazia:
    public ListaEncadeada(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    //Criando método para inserir no início da lista:
    public void insereInicio(int valor) {
        No novoNo = new No(valor);
        if (inicio == null){
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
        tamanho++;
    }
    //Criando método para inserir no fim da lista:
    public void insereFim(int valor){
        No novoNo = new No(valor);
        if (fim == null){
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
    }
    //Criando método para posição específica na lista:
    public void inserePosicao(int valor, int posicao){
        if (posicao < 0 || posicao > tamanho){
            System.out.println("Posição inválida!");
            return;
        }
        if (posicao == 0){
            insereInicio(valor);
        } else if (posicao == tamanho) {
            insereFim(valor);
        } else {
            No novoNo = new No(valor);
            No atual = inicio;
            for (int i = 0; i < posicao - 1; i++){
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
            tamanho++;
        }
    }
    //Criando método para remover no início da lista:
    public void removeInicio(){
        if (inicio == null){
            System.out.println("Lista Vazia!");
            return;
        }
        inicio = inicio.proximo;
        if (inicio == null){
            fim = null;
        }
        tamanho--;
    }
    //Criando método para remover no fim da lista:
    public void removeFim(){
        if (fim == null){
            System.out.println("Lista Vazia!");
            return;
        }
        if (inicio == fim){
            inicio = fim = null;
        } else {
            No atual = inicio;
            while (atual.proximo != fim){
                atual = atual.proximo;
            }
            atual.proximo = null;
            fim = atual;
        }
        tamanho--;
    }
    //Criando método para remover na posição específica da lista:
    public void removePosicao( int posicao){
        if (posicao < 0 || posicao >= tamanho){
            System.out.println("Posição inválida!");
            return;
        }
        if (posicao ==0){
            removeInicio();
        } else if (posicao == tamanho - 1) {
            removeFim();
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao - 1; i++){
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }
    }
    // Criando método para remover elemento da lista:
    public void removeElemento(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
        if (inicio.valor == valor) {
            removeInicio();
            return;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo;
                if (atual.proximo == null) {
                    fim = atual;
                }
                tamanho--;
                return;
            }
            atual = atual.proximo;
        }
    }

    // Criando método para exibir lista:
    public void exibeLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Criando método para pesquisar elemento na lista:
    public int pesquisaElemento(int valor) {
        No atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1; // Elemento não encontrado
    }

    // Criando método para retornar elemento existente na lista:
    public int tamanho() {
        return tamanho;
    }

    private class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.insereInicio(8);
        lista.insereInicio(5);
        lista.insereInicio(9);

        System.out.println("Lista com os elementos inseridos no início: ");
        lista.exibeLista();

        lista.insereFim(6);
        lista.insereFim(3);

        System.out.println("Lista com os elementos inseridos no fim: ");
        lista.exibeLista();

        lista.inserePosicao(2, 7);

        System.out.println("Lista com os elementos inseridos na posição específica: ");
        lista.exibeLista();

        lista.removeInicio();

        System.out.println("Lista após remover elemento no início:");
        lista.exibeLista();

        lista.removeFim();

        System.out.println("Lista após remover elemento no fim: ");
        lista.exibeLista();

        lista.removePosicao(2);

        System.out.println("Lista após remover elemento na posição específica: ");
        lista.exibeLista();

        lista.removeElemento(4);

        System.out.println("Lista após remover novo elemento: ");
        lista.exibeLista();

        int posicao = lista.pesquisaElemento(5);
        if (posicao != -1){
            System.out.println("Elemento 5 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 5 não encontrado.");
        }
        System.out.println("O tamanho da lista é: " + lista.tamanho());

    }
}