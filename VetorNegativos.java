import java.util.Scanner;

public class VetorNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor de N
        System.out.print("Digite a quantidade de números (máximo 10): ");
        int N = scanner.nextInt();

        // Verificando se N está dentro do limite
        if (N <= 0 || N > 10) {
            System.out.println("Valor de N inválido. Deve ser um número inteiro positivo entre 1 e 10.");
            return;
        }

        // Criando o vetor para armazenar os números
        int[] numeros = new int[N];

        // Lendo os números e armazenando no vetor
        System.out.println("Digite " + N + " números inteiros:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Imprimindo os números negativos
        System.out.println("Números negativos:");
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}