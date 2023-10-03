//Write a program to find maximum between three numbers

package javaapplication1;
import java.util.Scanner;

public class maxof3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greatest");
        }
        else if(c>a && c>b)
        {
            System.out.println(c+" is greatest");
        }
    }
}
