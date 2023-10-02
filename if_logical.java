
package javaapplication1;
import java.util.Scanner;

public class if_logical {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        marks=sc.nextInt();
        if(marks>=0 && marks<=100)
        {
            System.out.println("Valid marks");
        }
        else
        {
            System.out.println("Invalid marks");
        }
    }
    
}
