import java.util.Scanner;
import java.util.ArrayList;

public class alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int N = scanner.nextInt();

        // Criando arrays para armazenar os dados
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        // Lendo os dados de cada pessoa
        for (int i = 0; i < N; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        // Calculando a altura média
        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        double mediaAlturas = somaAlturas / N;

        // Calculando a porcentagem de pessoas com menos de 16 anos
        int contMenores = 0;
        ArrayList<String> nomesMenores = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                contMenores++;
                nomesMenores.add(nomes[i]);
            }
        }
        double porcentagemMenores = (double) contMenores / N * 100;

        // Imprimindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Altura média das pessoas: " + mediaAlturas + " cm");
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemMenores + "%");

        // Imprimindo os nomes das pessoas com menos de 16 anos
        if (!nomesMenores.isEmpty()) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (String nome : nomesMenores) {
                System.out.println(nome);
            }
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }
    }
}