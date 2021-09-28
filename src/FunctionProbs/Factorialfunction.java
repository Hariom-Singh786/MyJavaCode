package FunctionProbs;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
public class Factorialfunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.print("Input a number :");
            int num = sc.nextInt();
            if(num<0){
                System.err.println("factorial of negative Integer is not Possible!");
                break;
            }
            int ans= factorial(num);
            System.out.println("Factorial of "+num+" is :"+ans);
        }
    }
    private static int factorial(int num) {
        int fact=1;
        if(num==1 || num==0){
            return 1;
        }
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
