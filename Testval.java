import java.io.*;
import java.util.Scanner;
public class Testval{
    public static void main(String args[]){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
         a=input.nextInt();
         b=input.nextInt();
         c= a+b;
        System.out.println("the sum is "+c);

    }
}