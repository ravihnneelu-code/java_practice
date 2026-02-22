package day1basics;

public class ReverseNum {
    public static void main(String[]args)
    {
        int num =123456789;
        int RevNum=0;
        int originalNum=num;
        while(num!=0)
        {
            int remainder = num % 10; //get last digit eg: 5
            RevNum =RevNum*10+remainder;
            num=num/10; //remove last digit
            //System.out.println("Remainder: "+remainder);
        }
        System.out.println("original number: "+originalNum);
        System.out.println("Reverse number: "+RevNum);
    }
}
