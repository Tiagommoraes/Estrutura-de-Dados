/*02) - Um treinador de vôlei precisa manter estatísticas sobre seu time.
Para isso, para cada um dos 6 jogadores efetivos ele anota o número de saques,
bloqueios e ataques que resultaram em pontos. Escreva um programa que permita ao
treinador armazenar esses dados em uma matriz (não é permitido utilizar vetores separados para cada item)
e ao final imprima o percentual de pontos concretizados pelo time para cada fundamento
(saque, bloqueio, ataque) avaliado.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[][] estatisticas = new int[6][3];
        int TotalPontos = 0;

        for (int i = 0; i < 6; i++){
            System.out.println("Jogador" + (i + 1));
            for (int j = 0; j < 3; j++){
                switch (j){
                    case 0:
                        System.out.println("Saques: ");
                        break;
                    case 1:
                        System.out.println("Bloequeis: ");
                        break;
                    case 2:
                        System.out.println("Ataques: ");
                        break;
                }
                estatisticas[i][j] = scr.nextInt();
                TotalPontos += estatisticas[i][j];
            }
        }
        System.out.println("Percentuais de pontos concretizados: ");
        for (int j = 0; j < 3; j++){
            int pontosFundamento = 0;
            for (int i = 0; i < 6; i++){
                pontosFundamento += estatisticas[i][j];
            }
            double percentual = ((double) pontosFundamento / TotalPontos) * 100;
            switch (j){
                case 0:
                    System.out.printf("Saques: %.2f%%\n", percentual);
                    break;
                case 1:
                    System.out.printf("Bloqueios: %.2f%%\n", percentual);
                    break;
                case 2:
                    System.out.printf("Ataques: %.2f%%\n", percentual);
                    break;
            }
        }
    }
}