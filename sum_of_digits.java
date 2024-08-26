//Write a program to calculate sum of digits of a number.  
import java.util.Scanner;
package javaapplication1;

public class sum_of_digits {
    public static void main(String[] args) {
        int i, n, digit, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
         while(n > 0)  
{  
digit = n % 10;  
sum = sum + digit;  
n = n / 10;  
}  
System.out.println("Sum of Digits: "+sum);  
}  
}  
    }
    
}
