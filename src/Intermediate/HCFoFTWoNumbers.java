package Intermediate;

import java.util.Scanner;

public class HCFoFTWoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int HCF=1;
        for(int i=2;i<Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                HCF=i;
            }
        }
        System.out.println("HCF of" +a+ " and" +b+ ": "+HCF);
    }
}
