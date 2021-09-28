package FunctionProbs;

import java.util.Scanner;

//Write a program to print the circumference and area of
// a circle of radius entered by user by defining your own method.
public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float r=sc.nextFloat();
        findAreaCircumference(r);
    }
    private static void findAreaCircumference(float r) {
        float PI=3.14f;
        double area,cir;
        cir=2*PI*r;
        area=PI*r*r;
        System.out.println("circumference of circle :"+cir);
        System.out.println("Area of circle :"+area);
    }
}
