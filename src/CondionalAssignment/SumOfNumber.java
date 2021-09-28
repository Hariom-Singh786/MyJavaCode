package CondionalAssignment;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("this Program takes user input and finds its sum until enters Zero(0)");
        int sum=0;
        while(true){
            System.out.print("Input a number :");
            int n=in.nextInt();
            if(n>0 || n<0){
                sum+=n;
            }else{
                break;
            }
        }
        System.out.println("Sum of Entered Numbers :"+sum);
    }
}
