import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o codigo do produto 1, separe com espaco digite a quantidade, separe novamente e digite o valor do produto: ");
 int nump1 = scanner.nextInt();
 int quantidade1 = scanner.nextInt();
 final double preco1 = scanner.nextDouble();
 double pagar1 = quantidade1*preco1;

 System.out.println("digite o codigo do produto 2, separe com espaco digite a quantidade, separe novamente com e digite o valor do produto: ");
 int nump2 = scanner.nextInt();
 int quantidade2 = scanner.nextInt();
 final double preco2 = scanner.nextDouble();
    double pagar2 = quantidade2*preco2;

    double conta = pagar1+pagar2;
    System.out.println("VALOR A PAGAR: R$"+conta);
}

