import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int i, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        for (i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        System.out.println("=================================================");
        System.out.println("\t\t Results");
        System.out.println("===============================================");
        for (i = 0; i < 5; i++)
            System.out.println(marks[i] + "\t");
        System.out.println("\n --------------------------------------------------");
        System.out.println("\t\t Total = " + total);
    }
}
