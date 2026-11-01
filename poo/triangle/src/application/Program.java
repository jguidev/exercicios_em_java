package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program { 
    public static void main(String[]args){
  
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

 Triangle x,y;
 x = new Triangle();
 y = new Triangle();
 
 System.out.println("enter the measures of triangle X:");
 x.a = sc.nextDouble();
 x.b = sc.nextDouble();
 x.c = sc.nextDouble();
 
System.out.println("enter the measures of triangle Y:");
 y.a = sc.nextDouble();
 y.b = sc.nextDouble();
 y.c = sc.nextDouble();
 
 double areax = x.area();
 double areay = y.area();
 


 System.out.printf("Triangle X area : %.2f%n",areax);
 System.out.printf("Triangle Y area : %.2f%n",areay);

    if(areax>areay){
        System.out.println("LARGER AREA:X");
    }
    else if(areax==areay){
        System.out.print("SAME");
    }
    else{
        System.out.println("LARGER AREA:Y");

    }



sc.close();
}

}
