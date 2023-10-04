
package javaapplication1;

public class odd_1_100 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i+"\t");
        }
        System.out.println("End of program");
    }
}
