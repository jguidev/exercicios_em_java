package application;

import java.util.Scanner;

import entities.Dados;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();
        System.out.println("Enter the name, gross salary and tax of the employee");
        dados.name = sc.next();
        dados.grossSalery = sc .nextDouble();
        dados.tax = sc.nextDouble();

        System.out.println("Name:"+dados.name);
        System.out.println("Gross Salary:"+dados.grossSalery);
        System.out.println("Tax:"+dados.tax);


        
        
        System.out.println("Employee: "+dados.name+",  $ " + dados.NetSalary());
        System.out.println("Which percentage to increase salary?");
        
        double percentage=sc.nextDouble();

        dados.increasesalary(percentage);

        System.out.println(dados.toString());

      sc.close();


    }
}
