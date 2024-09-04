import java.util.Scanner;
public class senha {
  public static void main(String[] args) {
    Scanner scanner = new 
    Scanner(System.in);
    String correctPassword = "senha";  
    String inputPassword;
    do {
      System.out.print("Digite a senha: ");
      inputPassword = scanner.nextLine();
    } while (!inputPassword.equals(correctPassword));
    System.out.println("Access granted!");
    scanner.close();
  }
}