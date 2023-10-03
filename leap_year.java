//Write a program to check whether a year is leap year or not.

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
        System.out.println("Enter a year");
        if(year%4==0) 
        {
            System.out.println(year+" is a leap year");
        }
        else if(year%100==0)
        {
            System.out.println(year+" is not a leap year");
        }
        else if(year%400==0)
        {
            System.out.println(year+"is a leap year");
        }
        else
        {
            System.out.println("invalid year");
        }
    }
}

