import java.util.Scanner;
public class QuadrantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite coordenada x: ");
            int x = scanner.nextInt();
            System.out.print("Digite coordenada y: ");
            int y = scanner.nextInt();
            if (x == 0 || y == 0) {
                scanner.close();
                return; 
            }
            if (x > 0 && y > 0) {
                System.out.println("Quadrante I");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante II");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante III");
            } else {
                System.out.println("Quadrante IV");
            }
        }
    }
}