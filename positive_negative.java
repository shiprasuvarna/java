//Write a program to check whether a number is negative, positive

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println(num+" is positive");
    }
        else if(num<0)
        {
            System.out.println(num+" is negative");
        }
        else
        {
            System.out.println("Inalid number");
        }
    
}
