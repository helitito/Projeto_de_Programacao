import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o primeiro numero: ");
    int A = scanner.nextInt();
    System.out.println("digite o segundo numero: ");
    int B = scanner.nextInt();
    System.out.println("digite o terceiro numero: ");
    int C = scanner.nextInt();
    System.out.println("digite o quarto numero: ");
    int D = scanner.nextInt();

     int resultado = (A*B)-(C*D);

    System.out.printf("O resultado é:"+resultado);
}