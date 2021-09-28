package Intermediate;

import java.util.Scanner;

public class LCMofTwoNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Two Number :");
        int a= sc.nextInt();
        int b=sc.nextInt();

//        for(int i=2;i<Math.max(a,b);i++){
//            if(a%i==0&&b%i==0){
//                GCD=i;
//            }
        //}
        int LCM;
        int hcf=HCF(a,b);
        LCM= (a*b)/hcf;
        System.out.println("GCD :"+hcf);
        System.out.println("LCM :"+LCM);
    }
    static int HCF(int a,int b){

        int GCD=1;
        for(int i=2;i<Math.max(a,b);i++) {
            if(a%i==0 &&b%i==0){
                GCD=i;
            }
        }
        return GCD;
    }
}
