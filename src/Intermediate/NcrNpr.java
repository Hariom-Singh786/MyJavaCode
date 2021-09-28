package Intermediate;

import java.util.Scanner;

//Find Ncr & Npr
public class NcrNpr {
    public static void main(String[] args) {
        System.out.print(" input value of N and R :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        if(n>0) {
            int ncr = fact(n) / (fact(r) * fact(n - r));
            int npr = fact(n) / fact(n - r);
            System.out.println("NCR :"+ncr);
            System.out.println("NPR :"+npr);
        }else{
            System.out.println(" N should be greater Than Zero !");
        }
    }

    static int fact(int n) {
        int fa=1;
            for (int i = 1; i <= n; i++) {
                fa *= i;
            }
            return fa;
        }
}
