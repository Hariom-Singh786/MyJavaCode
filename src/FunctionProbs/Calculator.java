package FunctionProbs;

import java.util.Scanner;

//return sum and product of two numbers entered by the user
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Two Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=returnSum(a,b);
        int mul=returnMul(a,b);
        System.out.println("Sum of Both :"+sum);
        System.out.println("Mul of Both :"+mul);
    }
    public static int returnSum(int a, int b){
        return a+b;
    }
    public static int returnMul(int a,int b){
        return a*b;
    }
}
