package application;

import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Enter your name and your three grades along of the semester");

        st.name = sc.nextLine();
        st.g1 = sc.nextDouble();
        st.g2 = sc.nextDouble();
        st.g3 = sc.nextDouble();

        
       if(st.g1+st.g2+st.g3>=60){
        System.out.println("FINAL GRADE = "+ st.finalGrade()+"\nPASS");
       
       }
        
       else{
        System.out.println("FINAL GRADE = "+ st.finalGrade()+"\n"+"FAILED"+"\nMISSING POINTS "+ st.missingPoints());


       }


       sc.close();

    }
}
