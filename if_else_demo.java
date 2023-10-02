package javaapplication1;
import java.util.Scanner;

public class if_else_demo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is grester");
    }
        else
        {
            System.out.println(b+" is greater");
}
