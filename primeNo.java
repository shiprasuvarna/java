import java.util.Scanner;
package javaapplication1;

public class primeNo {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number");
        n=sc.nextInt();
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a prime number");
                break;
            }
        }
        if(n==i)
        {
            System.out.println("Prime number");
        }
    }
}
