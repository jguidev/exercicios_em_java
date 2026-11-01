import java.util.Scanner;
public class exercicioloop1{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   String y ="";

    while (!y.equals("2002")) {
     
       System.out.println("digite a senha:");
       y = sc.nextLine();
       if (!y.equals("2002")) {
        System.out.println("senha invalida");
      }
    }
    System.out.println("acesso permitido");
   sc.close();
  }

} 