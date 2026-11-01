import java.util.Locale;
import java.util.Scanner;

import converter.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("what is dollar price?");
        double price = sc.nextDouble();
        CurrencyConverter.dollarprice = price;
        System.out.println("How many dollar will be bought?");
        double buy = sc.nextDouble();
        CurrencyConverter.bought = buy;
        CurrencyConverter.pay(price,buy);
        System.out.printf("Amount of dollar will be paid in reais:%.2f\n",CurrencyConverter.pay(price, buy));
       
        
        sc.close(); 


    }
}
