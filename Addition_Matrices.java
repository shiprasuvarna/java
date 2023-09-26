package Arrays;

import java.util.Scanner;

public class Addition_Matrices {

    public static void main(String[] args) {
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] m3 = new int[2][2];
        int i, j,k;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the elements of 1st matrix");
        for (i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                m1[i][j]=sc.nextInt();
            }  
        }
        
         System.out.println("Enter the elements of 2nd matrix");
        for (i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                m2[i][j]=sc.nextInt();
            }  
        }

        
        for (i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                m3[i][j]=0;
                for ( k = 0; k < 2; k++) {
               m3[i][j]=m1[i][j]+m2[i][j];
                }
            }  
        }
        
        System.out.println("Addition");
        for (i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.print( m3[i][j]+"\t");
            }  
            System.out.println("");
        }
        
        
        
    }

}
