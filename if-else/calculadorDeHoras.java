import java.util.Scanner;
public class calculadorDeHoras {
    public static void main(String[]args){
        int inicio,fim;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao calculador de horas!");
        System.out.print("Escolha os horarios de inicio e final\n");
        inicio = sc.nextInt();
        fim = sc.nextInt();
        if (inicio < 0 || inicio > 23 || fim < 0 || fim > 23) {
            System.out.println("Horario invalido! Use valores entre 0 e 23.");
          return;
        }
        int duracao;
        if(fim>inicio){
            duracao=fim-inicio;
        }
        else if (inicio==fim) {
             duracao=24;
        }
        else {
            duracao=(24-inicio)+fim;
        }
        System.out.print("A duração é de: " +duracao+ " horas");
        
         sc.close();
    }
    
}
