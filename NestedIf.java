//Q Enter the gender and age of a person and declare whether the person is senior citizen or not 
//(for male 60 and above and for female 55 and above)
import java.util.Scanner;
     
public class NestedIf {
    public static void main(String[] args) {
        char gender;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender(m/f) and age of the person");
        gender=sc.next().charAt(0);
        age=sc.nextInt();
        if(gender=='m' || gender=='M')
        {
            if(age>=60)
            {
                System.out.println("Senior citizen");
            }
            else
            {
                System.out.println("Not a senior citizen");
            }
   }
         else if(gender=='f' || gender=='F')
        {
            if(age>=55)
            {
                System.out.println("Senior citizen");
            }
            else
            {
                 System.out.println("Not a senior citizen");
        }
    
        }
         else{
             System.out.println("Invalid gender");
         }
    }
}

