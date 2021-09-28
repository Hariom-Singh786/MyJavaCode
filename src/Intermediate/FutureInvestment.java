package Intermediate;
//future investment program in java
//futInv=p*(1+R)^Y
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Current Amount :");
        double p= sc.nextInt();
        System.out.print("Rate of Interest :");
        double r= sc.nextInt();
        System.out.print("Time Interval (IN YEAR)  :");
        double y=sc.nextInt();
        double ans= futureInvest(p,r,y);
        System.out.println("Answer :"+ans);
    }
    static double futureInvest(double p,double r ,double y){
        double res= p*Math.pow((1+r),y);
        return res;
    }
}
