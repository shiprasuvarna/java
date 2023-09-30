
package javaapplication1;
import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        float per;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your percentage");
        per=sc.nextFloat();
        if(per>=90 && per<=100)
        {
            System.out.println("A");
        }
        else if(per>=75 && per<90)
        {
            System.out.println("B");
        }
        else if(per>=60 && per<75)
        {
            System.out.println("C");
        }
        else if(per>=45 && per<60)
        {
            System.out.println("D");
        }
        else if(per>=32 && per<45)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}