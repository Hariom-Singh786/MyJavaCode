package Intermediate;

import java.util.Scanner;

//Factorial Program In Java
public class Factrorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a Number :");
        int num=sc.nextInt();
        int fact=1;
        if(num==0){
            System.out.println("Factorial :"+ fact);
        }
        if(num<0){
            System.out.println("Please Input +ve Number");
        }
        for(int i=1;i<=num;i++){
            fact=fact*i;
            System.out.println("step" +i+ " :" +fact);
        }
        if(num>0) {
            System.out.println("factorial is :" + fact);
        }
    }
}
