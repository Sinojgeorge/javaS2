import java.io.*;
import java.util.*;
import java.util.Scanner;
class Arraysearch
{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int i,n,search,flag=0;
        System.out.println("Enter the number of elements:");
        n=ip.nextInt();
        int[] a=new int[n];

        System.out.println("Enter the elements:");
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        System.out.println("Enter the item to be searched:");
        search=ip.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==search){
                System.out.println("Element"+search+"found at"+(i+1)+"position");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element"+search+"not found");
        }
    }
}