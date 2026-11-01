package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    
    System.out.println("Enter product data");

    System.out.println("Name");
    product.name = sc.nextLine();
    System.out.println("Price");
    product.price = sc.nextDouble();
    System.out.println("Quantity in stock");
    product.quantity = sc.nextInt();


    System.out.print(product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock:");
    int quantity=sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.printf("Updated data:" +product);
       
    
    System.out.println();
    System.out.print("Enter the number of products to be removed in stock:");
    int quantity2=sc.nextInt();
    product.removeProducts(quantity);
    
    System.out.println();
    System.out.printf("Updated data:" +product);




   // System.out.printf("Product data: %s, $%f, %d units ,total: %f",product.name,product.price,product.quantity,totalValueInStock);

sc.close();
    }
}
