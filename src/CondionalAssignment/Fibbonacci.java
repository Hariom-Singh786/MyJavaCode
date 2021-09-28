package CondionalAssignment;

import java.util.Scanner;

/*Fibonacci Series In Java Programs*/ // 0 1 1 2 3 5 8.....
public class Fibbonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("input value of 'n' :");
        int n=sc.nextInt();
        int next;
        System.out.print("Which fibonacci you want :");
        int choice=sc.nextInt();
        System.out.print(a + " " +b);
        for(int i=2;i<=n;i++){
            next=a+b;
            System.out.print(" " +next);
            if(choice==i-1){
                System.out.println("\nyour choice fibonacci :"+next);
            }
            a=b;
            b=next;


        }
    }
}
