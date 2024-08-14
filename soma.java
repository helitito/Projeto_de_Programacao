import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o 1 numero: ");
    int A = scanner.nextInt();
    System.out.println("digite o 2 numero: :");
    int B = scanner.nextInt();

    int soma = A+B;
    System.out.println("o resultado é: "+ soma);
    scanner.close();
}
