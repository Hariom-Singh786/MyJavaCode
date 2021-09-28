package CondionalAssignment;

import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class FIndFactors {
    public static void main(String[] args) {
        System.out.print("Input a number :");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+ "  ");
            }
        }
    }
}
