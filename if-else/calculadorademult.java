import java.util.Scanner;

public class calculadorademult{
    public static void main(String[]args){
        int a,b;
        System.out.print("escolha dois numeros\n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%b==0 || b%a ==0){
            System.out.print("multiplos");
        }
        else{
            System.out.print("não são multiplos");
        }
 sc.close();
    }
}