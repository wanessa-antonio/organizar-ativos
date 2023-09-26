import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrganizadorAtivos {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> ativos = new ArrayList<>();

            // Entrada dos tipos de ativos
            int quantidadeAtivos = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            // Entrada dos códigos dos ativos
            for (int i = 0; i < quantidadeAtivos; i++) {
                String codigoAtivo = scanner.nextLine();
                ativos.add(codigoAtivo);
            }

            // Ordenar os ativos em ordem alfabética
            Collections.sort(ativos);

            // Imprimir a lista de ativos ordenada
            for (String ativo : ativos) {
                System.out.println(ativo);
            }
        }
    }
}

