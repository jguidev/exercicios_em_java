package application;

import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();
        System.out.println("width="+rec.width);
        System.out.println("height="+rec.height);


        System.out.println("area ="+rec.area());
        System.out.println("diagonal ="+rec.diagonal());
        System.out.println("perimeter ="+rec.perimenter());

        



        sc.close();


    }
}
