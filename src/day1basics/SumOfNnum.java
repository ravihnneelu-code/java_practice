package day1basics;

public class SumOfNnum {
    public static void main(String[]args)
    {
        int res=0;
        for(int i=1;i<=10;i++)
        {
           res+=i;
           System.out.println("Sum of N numbers: "+res);
           res-=i;
           System.out.println("difference of n numbers: "+res);
        }
    }
}
