import java.util.Scanner;
package javaapplication1;

public class summation {
    public static void main(String[] args) {
        int i, n, s;
        s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1; i<=n; i++)
        {
            s=s+i;
        }
        System.out.println("Summation of first " +n+ "=" +s);
    }
    
}
