package FunctionProbs;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MaxandMinFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Three Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans1=max(a,b,c);
        int ans2=min(a,b,c);
        System.out.println("Maximum :"+ans1);
        System.out.println("Minimum :"+ans2);
    }

    private static int min(int a, int b, int c) {
        if(a<b && a<c){
            return a;
        }if(b<a &&b<c){
            return b;
        }else{
            return c;
        }
    }

    private static int max(int a, int b, int c) {
        if(a>b&&a>c){
            return a;
        }if(b>a&&b>c){
            return b;
        }else{
            return c;
        }
    }

}
