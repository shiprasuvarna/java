//Write a program to check whether a number is even or odd

import java.util.Scanner;

public class even_odd{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even");
    }
        else if(num%2!=0)
        {
            System.out.println(num+" is odd");
        }
        else
        {
            System.out.println("Inalid number");
        }
    
}
}