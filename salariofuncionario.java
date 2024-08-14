import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o numero do funcionario: ");
    int numerof = scanner.nextInt();
    System.out.println("digite o numero de horas trabalhadas:");
    int ht = scanner.nextInt();
    System.out.println("digite o valor por hora trabalhada: ");
    final double $ = scanner.nextDouble();

    double salario = $*ht;

    System.out.println("NUMBER: "+numerof);
    System.out.println("SALARY : U$"+salario);
}
