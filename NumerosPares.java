import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor de N
        System.out.print("Digite a quantidade de números: ");
        int N = scanner.nextInt();

        // Criando o vetor para armazenar os números
        int[] numeros = new int[N];

        // Lendo os números e armazenando no vetor
        System.out.println("Digite " + N + " números inteiros:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Inicializando o contador de números pares
        int contadorPares = 0;

        // Imprimindo os números pares
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                contadorPares++;
            }
        }

        // Imprimindo a quantidade de números pares
        System.out.println("\nQuantidade de números pares: " + contadorPares);
    }
}