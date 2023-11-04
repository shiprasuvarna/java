
package Arrays;
import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        int i,j,temp;
        
        System.out.println("Enter the 5 numbers");
        for (i=0;i<5;i++) {
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("\n numbers before Sort:");
        for (i=0;i<5;i++) {
            System.out.print("\t"+  numbers[i]);
        }
        
        for (i=0;i<4;i++) {
            for (j=i+1;j<5;j++) {
                if(numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        
         System.out.println("\n numbers After Sort:");
        for (i=0;i<5;i++) {
            System.out.print("\t"+  numbers[i]);
        }
        
    }
}
