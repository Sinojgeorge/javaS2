import java.io.*;
import java.util.*;
import java.util.Scanner;
class cpu1
{
    int price=20000;
    class processor
    {
        int ncore=8;
        String Mname="intel";
        void display()
        {
            System.out.println("manufacturer name :"+Mname);
            System.out.println("Number of cores : "+ncore);
        }
    }
    static class ram
    {
        int msize=32;
        String rmname="Western Digital";
        void display1()
        {
            System.out.println("Ram");
            System.out.println("Ram size"+msize);
            System.out.println("Manufacturer name : "+rmname);
        }
    }
}
public class Cpu
{
    public static void main(String[] args)
    {
        System.out.println("System details");
        cpu1 ob1=new cpu1();
        cpu1.processor ob2=ob1.new processor();
        cpu1.ram ob3=new cpu1.ram();
        ob2.display();

        System.out.println("Processor price:"+ob1.price);
        ob3.display1();
    }
}
