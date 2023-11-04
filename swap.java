//swap two numbers without using a third variable in Java
import java.util.Scanner;
package javaapplication1;

public class swap {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers that you want to swap");
        x=sc.nextInt();
        y=sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("The numbers after swapping are: \n"+ x + "\n" + y);
    }
    
}
