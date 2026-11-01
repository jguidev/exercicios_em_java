import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("escolha um número até 10");
        int n = sc.nextInt();
        int[] numeros = new int[n];

           for(int i=0; i<n; i++){
             System.out.println("digite o numero da posição "+ i +":");
             numeros[i]=sc.nextInt();

         }
         System.out.println("os numeros digitados foram:");
         for(int i=0; i<n; i++){

            if (numeros[i]<0) {
             System.out.println(numeros[i]);   
            };
             
         }
        
    }
}
