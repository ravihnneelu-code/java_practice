package day1basics;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year:");
        int year= scanner.nextInt();
        boolean isLeap=false;
        if(year%4==0) {        //add extra day every 4 years [365.2425: 4year*0.2425=1day]
            if (year % 100 == 0) {  //removes extra leaps every 100 years
                if (year % 400 == 0) { // add back leap every 400 years
                    isLeap = true;
                }
            }
            else{
                isLeap=true;
            }
        }
        if(isLeap){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
        scanner.close();
    }
}
