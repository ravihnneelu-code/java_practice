package day1basics;
import java.util.Scanner;
public class GradeSystem {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("A");
        }
        else if(75<=marks && marks<=89)
        {
            System.out.println("B");
        }
        else if(marks>=50 && marks<=74)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();
    }
}
