import java.io.*;
import java.util.Scanner;
public class Sort{
    public static void main(String args[]){
        Scanner b=new Scanner(System.in);
        System.out.println("Enter The Unsorted Array:");
        int [] arr=new int []{5,2,8,7,1,3,4,6,9,10};
        int temp =0;
        int num;
        System.out.println("Elements of original arrar:");
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order:");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"    ");
        }
      System.out.println("");
      System.out.println("enter the element for search:");
        num=b.nextInt();
        for(int i =0;i<arr.length;i++)
        {
           if(arr[i]==num)
           {
               System.out.println("the number "+ num +" found at position "+(i+1));
           }
        }
        
    }

}
