/*
Write a program to input basic salary of an employee and
calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */
package javaapplication1;
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        int salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary");
        salary=sc.nextInt()
        if(salary<=10000)
        {
            System.out.println("HRA=20% & DA=80%");
        }
        else if(salary<=20000)
        {
            System.out.println("HRA=25% & DA=90%");
        }
        else if(salary>20000)
        {
            System.out.println("HRA=30% & DA=95%");
        }
        else
        {
            System.out.println("Invalid salary");
        }
    }
    
}
