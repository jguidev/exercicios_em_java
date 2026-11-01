import java.util.Scanner;
public class laco{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int soma=0;
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            int y = sc.nextInt();
            soma+=y;


        }
        System.out.println(soma);

        sc.close();
    } 
}