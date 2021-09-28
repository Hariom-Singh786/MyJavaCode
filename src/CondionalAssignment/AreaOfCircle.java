package CondionalAssignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Program to find Area of Circle");
        System.out.print(" Input radius of the circle : ");
        Scanner sc= new Scanner(System.in);
        float radius= sc.nextFloat();
        float PI=3.14f;
        float Area= PI * radius * radius;
        System.out.println("Area of circle is :" +Area);
    }
}
