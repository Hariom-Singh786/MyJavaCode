package Basic;

import java.util.Scanner;

/*Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.*/
public class SImpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This Program is to calculate Simple Interest");
        while(true) {
            System.out.print("Input any Alphabet from 'A' to 'M' --> :" );
            char ch= sc.next().trim().charAt(0);
            if(ch>='A' && ch<='M') {
                System.out.print("Principle :");
                int p = sc.nextInt();
                System.out.print("Rate of Interest :");
                float r = sc.nextFloat();
                System.out.print("Years :");
                int t = sc.nextInt();
                float si;
                si = (p * r * t) / 100;
                System.out.println("Simple Interest :" + si);
            }else{
                System.out.println("Please Carefully choose Alphabet from A----M only !");
                break;
            }
        }
    }
}
