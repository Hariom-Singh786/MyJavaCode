package Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Power usage (watts) :");
        int p=sc.nextInt();
        System.out.print("Hours of Use / day :");
        int t=sc.nextInt();
        float E= (p*t)/100;
        System.out.println("Total energy used per Hour :"+E);
        int unit=5;
        float bill;
        if(E<99){
            bill=E*unit;
            System.out.println("Total Bill is :"+bill);
        }
        if(E>99 && E< 500){
            unit=9;
            bill=E*unit;
            System.out.println("Total Bill is :"+bill);
        }
        if(E>500 && E<1000){
            unit=15;
            bill=E*unit;
            System.out.println("Total Bill is :"+bill);
        }else{
            unit=25;
            bill=E*unit;
            System.out.println("Total Bill is :"+bill);
        }
    }
}
