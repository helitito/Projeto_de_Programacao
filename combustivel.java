import java.util.Scanner;
public class combustivel{
  scanner sc = new Scanner(System.in);
  int input;
  public void main(String[] args){
   while (input != 4){
     System.out.println("1 - Gasolina");
     System.out.println("2 - Alcool");
     System.out.println("3 - Diesel");
     string codigo = sc.nextLine();
     if (codigo == 1){
       int alcool =+1;
     }if (codigo == 2) {
       int gas =+1;   
} if (codigo == 3){
       int diesel =+1;     
}if (codigo == 4){
       System.out.println("Muito obrigado!");
       System.out.println("Alcool: " + alcool);
       System.out.println("Gasolina: " + gas);
       System.out.println("Diesel: " + diesel);
}
       else {
       System.out.println("Codigo invalido, por favor insira novamente: ");
         main();
       
    }
   }
  }
  
}