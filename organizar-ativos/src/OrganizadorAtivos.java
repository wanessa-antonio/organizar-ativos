import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class OrganizadorAtivos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> ativos = new ArrayList<>();

            // Solicita ao usuário que insira a quantidade de ativos
            System.out.print("Digite a quantidade de ativos: ");
            int quantidadeAtivos = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.println();

            // Solicita ao usuário que insira os tipos de ativos
            System.out.println("Digite os tipos de ativos:");

            for (int i = 0; i < quantidadeAtivos; i++) {
                String codigoAtivo = scanner.nextLine();
                ativos.add(codigoAtivo);
            }

            // Ordenar os ativos em ordem alfabética
            Collections.sort(ativos);
            
            System.out.println();
            
            // Imprimir a lista de ativos ordenada
            System.out.println("Ativos ordenados:");
            for (String ativo : ativos) {
                System.out.println(ativo);
            }
        }
    }
}
