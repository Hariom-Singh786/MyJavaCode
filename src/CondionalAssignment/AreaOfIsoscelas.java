package CondionalAssignment;

import java.util.Scanner;

public class AreaOfIsoscelas {
    public static void main(String[] args) {
        System.out.print("Input all Three sides of Triangle :");
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        double area=0;
        if(a==b && a!=c || b==a && b!=c ||c==a &&c!=b){
            area= Math.sqrt((a*a-(b*b)/4)*b);
            System.out.println("Area of Isoscelous triangle is :" +area);
        }else{
            System.out.println("It's not an Isoscelous Triangle");
        }

    }
}
