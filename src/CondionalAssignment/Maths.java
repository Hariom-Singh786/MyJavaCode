package CondionalAssignment;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        System.out.println("1 . Area of Parallelogram ");
        System.out.println("2 . Area of Rhombus");
        System.out.println("3 . Area of Equilateral Triangle ");
        System.out.println("4 . perimeter of Parallelogram");
        System.out.println("5 . perimeter of Rectangle");
        System.out.println("6 . perimeter of Square ");
        System.out.println("7 . perimeter of Rhombus");
        System.out.println("8 . volume of Cone");
        System.out.println("9 . volume of Prism");
        System.out.println("10 . volume of Cylinder");
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter your choice  No :");
        int choice=sc.nextInt();
        if(choice >=1 && choice <=10) {
            switch (choice) {
                case 1 -> {
                    System.out.print("Base :");
                    int base = sc.nextInt();
                    System.out.print("Height :");
                    int height = sc.nextInt();
                    System.out.println(" Area of parallelogram :" + (base * height));
                }
                case 2 -> {
                    System.out.print("Input Both diagonals of Rhombus :");
                    int d1 = sc.nextInt();
                    int d2 = sc.nextInt();
                    System.out.println("Area of Rhombus :" + (d1 * d1 * d2 * d2) / 2);
                }
                case 3 -> {
                    System.out.print("Side of Equilateral triangle:");
                    int a = sc.nextInt();
                    System.out.println("Area of Equilateral triangle : " + ((Math.sqrt(3) / 2) * a * a));
                }
                case 4 -> {
                    System.out.print("length of parallelogram :");
                    int l = sc.nextInt();
                    System.out.print("Width of parallelogram :");
                    int w = sc.nextInt();
                    System.out.println("Perimeter of parallelogram :" + (2 * (l + w)));
                }
                case 5 -> {
                    System.out.print("length of rectangle :");
                    int p = sc.nextInt();
                    System.out.print("width of rectangle :");
                    int q = sc.nextInt();
                    System.out.println("Perimeter of Rectangle :" + (2 * (p + q)));
                }
                case 6 -> {
                    System.out.print("Side of Square:");
                    int side = sc.nextInt();
                    System.out.println("Perimeter of square :" + (4 * side));
                }
                case 7 -> {
                    System.out.print("Side of Rhombus:");
                    int r = sc.nextInt();
                    System.out.println("Perimeter of Rhombus :" + (4 * r));
                }
                case 8 -> {
                    System.out.print("Height of cone :");
                    float h = sc.nextFloat();
                    float PI = 3.14f;
                    System.out.print("Radius of cone :");
                    float radius = sc.nextFloat();
                    double ans = (h / 3) * PI * radius * radius;
                    System.out.println("Volume of cone :" + ans);
                }
                case 9 -> {
                    System.out.print("Base area of Prism :");
                    float B = sc.nextFloat();
                    System.out.print("Height of Prism :");
                    float H = sc.nextFloat();
                    System.out.println("Volume of Prism :" + (B * H));
                }
                case 10 -> {
                    System.out.print("Radius of Cylinder :");
                    float R = sc.nextFloat();
                    System.out.print("Height of Cylinder :");
                    float he = sc.nextFloat();
                    float C = 3.14f;
                    System.out.println("Volume of Cylinder :" + (C * R * R * he));
                }
                default -> System.out.println("Invalid choice !");
            }
        }  else{
            System.out.println("Invalid choice !");
            break;
            }
        }
    }
}
