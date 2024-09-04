import java.util.Scanner;

public class triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as medidas do triângulo X:");
        double aX = sc.nextDouble();
        double bX = sc.nextDouble();
        double cX = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y:");
        double aY = sc.nextDouble();
        double bY = sc.nextDouble();
        double cY = sc.nextDouble();

        double areaX = calcularArea(aX, bX, cX);
        double areaY = calcularArea(aY, bY, cY);

        System.out.println("Área do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y possui a maior área.");
        } else {
            System.out.println("Os triângulos possuem áreas iguais.");
        }

        sc.close();
    }

    public static double calcularArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}