import java.io.*;
import java.util.Scanner;
public class Searcharray{
    public static void main(String args[]){
        int n,x,flag=0,i=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("enter the element you want to search:");
        x=input.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("element is found at position"+(i+1));
        }
        else{
            System.out.println("ollathu vallathum adiyadeyy");
        }
    }
}