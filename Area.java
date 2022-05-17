import java.io.*;
import java.util.*;
import java.util.Scanner;
class Area{
    void squareArea(float x)
    {
        System.out.println("Area of square="+(x*x)+"units");
    }
    void rectArea(float x,float y)
    {
        System.out.println("Area of rectangle is"+(x*y)+"units");
    }
    void circleArea(double r)
    {
        double a=3.14*r*r;
        System.out.println("area of circle="+a+"units");
    }
    public static void main(String[] args){
        Area obj=new Area();
        obj.squareArea(5);
        obj.rectArea(5,6);
        obj.circleArea(7);
    }
}