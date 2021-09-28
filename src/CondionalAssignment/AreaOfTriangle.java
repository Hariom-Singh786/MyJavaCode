package CondionalAssignment;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Height and Base of Triangle :");
        float base= sc.nextFloat();
        float height=sc.nextFloat();
        float Area=(base*height)/2;
        System.out.println("Area of Triangle :" +Area);
    }
}
