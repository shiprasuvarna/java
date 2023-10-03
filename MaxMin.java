import java.util.Scanner;
package javaapplication1;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter 5 numbers");
        for(i=0; i<5; i++)
        {
            array[i]=sc.nextInt();
    }
        int max = array[0];
        int min = array[0];
        
       for(i=0; i<4; i++){
       for(j=i+1; j<5; j++){
        if(array[i]>array[j]) 
        {
           max=array[i];
        }
       }
       }
       for(i=0; i<4; i++){
       for(j=i+1; j<5; j++){
        if(array[i]<array[j]) 
        {
            min=array[i];
        }
       }
       }
       System.out.println(max+ " is maximum");
       System.out.println(min+ " is minimum");
       
}
}

