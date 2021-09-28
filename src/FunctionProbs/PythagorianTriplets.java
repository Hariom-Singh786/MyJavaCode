package FunctionProbs;

import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not.
public class PythagorianTriplets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Three Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Boolean ans=pythagorian(a,b,c);
        if(ans==true){
            System.out.println(a+","+b+ ","+c+"  are Pythagorean Triplets");
        }
        if(ans==false){
            System.out.println(a+","+b+ ","+c+"  are  Not Pythagorean Triplets");
        }
    }
    private static Boolean pythagorian(int a, int b, int c) {
        if(a*a==b*b+c*c){
            return true;
        }
        if(b*b==a*a+c*c){
            return true;
        }
        if(c*c==a*a+b*b){
            return true;
        }
        return false;
    }
}
