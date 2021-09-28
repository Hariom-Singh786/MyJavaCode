package CondionalAssignment;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class FindLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        int n;
        while(true){
            System.out.print("Input a Number :");
            n=sc.nextInt();
            if(n>0 || n<0){
                if(n>largest){
                    largest=n;
                }
            }else{
                break;
            }
        }
        System.out.println("Largest number is :"+largest);

    }
}
