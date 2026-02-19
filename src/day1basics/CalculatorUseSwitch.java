package day1basics;
import java.util.Scanner;
public class CalculatorUseSwitch {
    public static void main(String[]args)
    {
        char operator;
        double num1,num2,res;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter an operator: ");
        operator = sc.next().charAt(0); //charAt(0) --> to convert str to char '+' -> +
        System.out.println("enter num1: ");
        num1=sc.nextDouble();
        System.out.println("enter num2: ");
        num2 = sc.nextDouble();
        switch(operator)
        {
            case '+' :
                res=num1+num2;
                System.out.println("sum: "+res);
                break;
            case '-' :
                res=num1-num2;
                System.out.println("difference: "+res);
                break;
            case '*' :
                res=num1*num2;
                System.out.println("multiple: "+res);
                break;
            case '/' :
                res=num1/num2;
                System.out.println("divide: "+res);
                break;
            default: System.out.println("Invalid operator");
        }
        sc.close();
    }
}
