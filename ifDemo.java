package SRC;
import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        char ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to exit? (y/n)");
        ans=sc.next().charAt(0);
        //since there is no next.char for char we use charAt(0) so it picks the first value of the array 
        if(ans=='y')
        {
            System.exit(0);
        }
        System.out.println("Program continues");
    }
}
