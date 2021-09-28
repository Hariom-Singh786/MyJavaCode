package FunctionProbs;
//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("input a number :");
        int num=sc.nextInt();
        boolean ans=isPrime(num);
        if(ans==true){
            System.out.println("prime");
        }
        if(ans==false){
            System.out.println("NonPrime");
        }
    }
    private static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }    return true;
    }
}
