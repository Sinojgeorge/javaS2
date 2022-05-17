import java.io.*;
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        System.out.println("enter a number to check wether its prime:");
        Scanner input = new Scanner(System.in);
        int i;
        int a = input.nextInt();
        for(i=2;i<a;i++){
            if(a % i ==0){
                System.out.println("the number is not prime");
            }else{
                System.out.println("the number is prime");
            }
        }
        
    }
}