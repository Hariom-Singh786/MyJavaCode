package CondionalAssignment;

import java.util.Scanner;

/*Subtract the Product and Sum of Digits of an Integer*/
public class SumProdOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int prod=1;
        int sum=0;
        int rem;
                while(num>0){
                    rem =num%10;
                    num/=10;
                    prod=prod*rem;
                    sum+=rem;
                }
                System.out.println("Subtraction of Product and Sum of Digits of Number :" +(prod-sum));

            }
        }
