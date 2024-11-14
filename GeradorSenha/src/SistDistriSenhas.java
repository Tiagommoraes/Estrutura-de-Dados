import java.util.Scanner;

public class SistDistriSenhas {
    public static void main(String[] args) {
        DistribuidorDeSenhas distribuidor = new DistribuidorDeSenhas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Distribuição de Senhas (10 senhas por execução)");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Solicitar Senha");
            System.out.println("2 - Chamar Próxima Senha");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    distribuidor.solicitarSenha(nomeCliente);
                }
                case 2 -> distribuidor.chamarProximaSenha();
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}