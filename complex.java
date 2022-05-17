import java.io.*;
import java.util.*;
import java.util.Scanner;
class comp1
{
    int r,i;
    Scanner c=new Scanner(System.in);
    public void get()
    {
        System.out.println("Enter the real part of complex number:");
        r=c.nextInt();
        System.out.println("Enter imaginary part:");
        i=c.nextInt();
    }
    public void display()
    {
        System.out.println(r+" + "+i+"i");
    }
}
class complex{
    public static void main(String[] args)
    {
        int r2,i2;
        comp1 ob1=new comp1();
        comp1 ob2=new comp1();
        System.out.println("Enter first complex number:");
        ob1.get();
        System.out.println("Enter second complex number:");
        ob2.get();
        System.out.println("complex numbers are:");
        ob1.display();
        ob2.display();
        System.out.println("The sum of complex numbers are::");
        r2=ob1.r+ob2.r;
        i2=ob1.i+ob2.i;
        System.out.println(r2+" + "+i2+"i");
    }
}