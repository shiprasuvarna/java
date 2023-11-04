//Write a program to find power of a number using for loop.
import java.util.Scanner;
package javaapplication1;

public class power {
    public static void main(String[] args) {
        int i=1, n, e, m=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its power");
        n=sc.nextInt();
        e=sc.nextInt();
        for(i=1; i<=e; i++)
        {
            m=m*n;
          
         }
        System.out.println(n + "^" +e+ "=" +m);
    }
}
