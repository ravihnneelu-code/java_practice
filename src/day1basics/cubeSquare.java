package day1basics;
import java.lang.Math;
public class cubeSquare {
    public static void main(String[]args) {
        int i = 3;
        double cube = Math.pow(i, 3);
        double square = Math.pow(i,2);
        double SquareRoot = Math.sqrt(i);
        System.out.println("cube:" + cube);
        System.out.println("square:" + square);
        System.out.println("SquareRoot: "+SquareRoot);
    }
}
