package FunctionProbs;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a number :");
        int n=sc.nextInt();
        check(n);
    }
    private static void check(int n) {
        if(n%2==0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+ " is Odd");
        }
    }
}
