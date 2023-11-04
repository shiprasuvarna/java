package SRC;


import java.util.*;
public class SimpleIntr {
    public static void main(String[] args) {
        float p, r, t, si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount, rate of interest and the time ");
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        si=(p*r*t)/100;
        System.out.println("Simple Interest: Rs"+si);
    }
  
}
