import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("quantos numeros você vai digitar?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for(int i=0;i<n;i++){
            System.out.println("digite um numero:");
            numeros[i]=sc.nextDouble();
            
        };
        double soma=0;
        for(int i=0; i<n; i++){
            soma+=numeros[i];
        };

        double media=soma/n;

        System.out.println("VALORES:");
         for(int i=0;i<n;i++){
            System.out.println(numeros[i]);
         
        };

        System.out.println("SOMA= "+soma);
        System.out.println("MËDIA= "+media);

        sc.close();


}
}