import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Senha {
    private final String nomeCliente;
    private final int numero;

    public Senha(String nomeCliente, int numero) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Senha #" + numero + " - Cliente: " + nomeCliente;
    }
}

class DistribuidorDeSenhas {
    private final Queue<Senha> filaDeSenhas;
    private int proximaSenha;

    public DistribuidorDeSenhas() {
        filaDeSenhas = new LinkedList<>();
        proximaSenha = 1;
    }

    // Método para solicitar uma nova senha (adiciona à fila)
    public void solicitarSenha(String nomeCliente) {
        if (proximaSenha <= 10) {
            Senha senha = new Senha(nomeCliente, proximaSenha++);
            filaDeSenhas.add(senha);
            System.out.println("Senha distribuída: " + senha);
        } else {
            System.out.println("Limite de senhas diárias atingido.");
        }
    }

    // Método para chamar a próxima senha (remove da fila)
    public void chamarProximaSenha() {
        if (filaDeSenhas.isEmpty()) {
            System.out.println("Nenhuma senha aguardando atendimento.");
        } else {
            Senha proxima = filaDeSenhas.poll();
            System.out.println("Atendendo " + proxima);
        }
    }
}
