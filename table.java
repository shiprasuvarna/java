//Write a program to print multiplication table of any number. 
import java.util.Scanner;
package javaapplication1;

public class table {
    public static void main(String[] args) {
        int i=1, n, m=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1; i<=10; i++)
        {
            m=n*i;       
    
        System.out.println(n + " x " + i + " = " + m);
}
}
}

