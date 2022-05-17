import java.io.*;
import java.util.*;
import java.util.Scanner;
class p

{
    String k;
        int z,p;
    public void get()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter product name : ");
        k=n.nextLine();
        System.out.println("Enter product code : ");
        z=n.nextInt();
        System.out.println("Enter product price : ");
        p=n.nextInt();
    }
    public void display()
    {
        System.out.println("Product name : "+k);
        System.out.println("Product code : "+z);
        System.out.println("Product price : "+p);

    }
}
class Product
{
    public static void main(String[] args)
    {
        p ob1=new p();
        p ob2=new p();
        p ob3=new p();

        ob1.get();


        ob2.get();


        ob3.get();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter product details:");
        System.out.println("Product 1");
        ob1.display();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter product details:");
        System.out.println("Product 2");
        ob2.display();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter product details:");
        System.out.println("Product 3");
        ob3.display();
        System.out.println("");
        System.out.println("Lowest price product");
    if(ob1.p < ob2.p && ob1.p< ob3.p)
    {
        
        
            System.out.println("Lowest price product :");
            System.out.println(ob1.k);
            System.out.println("price:");
            System.out.print(ob1.p);
    }
        
    else if(ob2.p < ob1.p && ob2.p < ob3.p)
        {
            System.out.println("Lowest price product :");
            System.out.println(ob2.k);
            System.out.println("price:");
            System.out.print(ob2.p);
        }
    
    else
    {
        System.out.println("Lowest price product :");
            System.out.println(ob3.k);
            System.out.println("price:");
            System.out.print(ob3.p);
    }
    }
}