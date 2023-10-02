
package javaapplication1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int i, n, f;
        f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=n; i>=1; i--)
            //or for(i=1; i<=n; i++)
        {
                f=f*i;
        }
        System.out.println("Factorial of "+n+ "=" +f);
    }
}
