
package javaapplication1;
import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        char alpha;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        alpha=sc.next().charAt(0);
        switch(alpha)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case '0':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("vowel");
                break;
                default:
                System.out.println("consonant");
                break;
        }
    }
}
