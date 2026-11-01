import java.util.Scanner;

public class exerciciojava {
    public static void main(String[]args){

        float a;
        System.out.print("olá,tudo bem escolha um numero aleatorio\n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        if(a>0){System.out.print("o numero é positivo");

        }
        else if(a==0){
            System.out.print("nulo");

        }
        else {
            System.out.print("positivo");
        }
       
        sc.close();
    }
}