package Atividade;

import java.util.Scanner;
public class Product {
    String Name;
    double Price;
    int Quantity;

    Scanner sc = new Scanner(System.in);
    public void setName(String Name) {
        System.out.println("Digite o nome do produto: ");
        Name = sc.nextLine();
    }

    public void setPrice(double Price) {
        System.out.println("Digite o preço do produto: ");
        Price = sc.nextDouble();

    }

    public void setQuantity(int Quantity) {
        System.out.println("Digite a quantidade em estoque do produto: ");
        Quantity = sc.nextInt();
    }
    public double TotalValueStock(int Quantity){
        return Price*Quantity;
    }
    public void AddProduct(int Quantity){
        System.out.println("Digite a quantidade adicionada ao estoque:");
        int a = sc.nextInt();
        Quantity =+a;
        System.out.printf("Updated data:"+Name,"$ "+Price,"Em estoque:"+Quantity,"$ "+TotalValueStock(Quantity));
    }
    public void RemoveProduct(int quantity){
        System.out.println("Digite a quantidade retirada do estoque:");
        int b = sc.nextInt();
        Quantity =-b;
        System.out.printf("Updated data:"+Name,"$ "+Price,"Em estoque:"+Quantity,"$ "+TotalValueStock(Quantity));
    }
}
