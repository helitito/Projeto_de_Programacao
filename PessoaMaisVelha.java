import java.util.Scanner;

public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        // Criando os vetores para armazenar os nomes e as idades
        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];

        // Lendo os nomes e idades
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            // Consumir o restante da linha para a próxima iteração
            scanner.nextLine();
        }

        // Encontrando a pessoa mais velha
        int indiceMaisVelha = 0;
        for (int i = 1; i < numPessoas; i++) {
            if (idades[i] > idades[indiceMaisVelha]) {
                indiceMaisVelha = i;
            }
        }

        // Imprimindo o nome da pessoa mais velha
        System.out.println("A pessoa mais velha é: " + nomes[indiceMaisVelha]);
    }
}