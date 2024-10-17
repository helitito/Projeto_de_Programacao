import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor de N
        System.out.print("Digite a quantidade de números: ");
        int N = scanner.nextInt();

        // Criando o vetor para armazenar os números
        double[] numeros = new double[N];

        // Lendo os números e armazenando no vetor
        System.out.println("Digite " + N + " números reais:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Imprimindo todos os elementos do vetor
        System.out.println("Números digitados:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Calculando a soma e a média
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / N;

        // Imprimindo a soma e a média
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}