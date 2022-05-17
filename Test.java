import java.io.*;
import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        int c=input.nextInt();
        System.out.println("square:" + c*c);
    }
}