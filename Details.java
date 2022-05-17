import java.io.*;
import java.util.Scanner;
public class Details{
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        int a;
        String  d,e,f;
        System.out.println("Enter your name");
        d=k.nextLine();
        System.out.println("Enter your address");
        e=k.nextLine();
        System.out.println("Enter your age");
        a=k.nextInt();
        System.out.println("Name : "+d);
        System.out.println("Address : "+e);
        System.out.println("Age : "+a);
    }

}