import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double pi = 3.14159;
    System.out.println("digite o raio do circulo: ");
    double A = scanner.nextDouble();
    double area = pi*A*A;
    System.out.println("a area do circulo e de: " +area);
    scanner.close();
}