import java.util.Scanner;

public class AnaliseDadosPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int N = scanner.nextInt();

        // Criando os vetores para armazenar os dados
        double[] alturas = new double[N];
        char[] generos = new char[N];

        // Lendo os dados de cada pessoa
        for (int i = 0; i < N; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Altura (em metros): ");
            alturas[i] = scanner.nextDouble();
            System.out.print("Gênero (M/F): ");
            generos[i] = scanner.next().charAt(0);
        }

        // Encontrando a maior e menor altura
        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        for (double altura : alturas) {
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        // Calculando a média de altura das mulheres e o número de homens
        double somaAlturasMulheres = 0;
        int numMulheres = 0;
        int numHomens = 0;
        for (int i = 0; i < N; i++) {
            if (generos[i] == 'F') {
                somaAlturasMulheres += alturas[i];
                numMulheres++;
            } else if (generos[i] == 'M') {
                numHomens++;
            }
        }
        double mediaAlturasMulheres = numMulheres > 0 ? somaAlturasMulheres / numMulheres : 0;

        // Imprimindo os resultados
        System.out.println("Maior altura: " + maiorAltura + " m");
        System.out.println("Menor altura: " + menorAltura + " m");
        System.out.println("Média de altura das mulheres: " + mediaAlturasMulheres + " m");
        System.out.println("Número de homens: " + numHomens);
    }
}