package FunctionProbs;

import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class PrimeNumsBtTwoNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Starting Point:");
        int start=sc.nextInt();
        System.out.print("End point :");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++,++start){
            int result=primeCheck(start,end);
            System.out.println(result);
        }
    }
    private static int primeCheck(int start, int end) {
        boolean flag=true;
     if(start==1 || start ==0){
         flag=false;
     }
     int i,j;
     for( i=start;i<=end;i+=2,++start) {
         flag = true;
         for (j = 2; j <= i / 2; j++) {
             if (i % j == 0) {
                 flag = false;
                 break;
             }
         }
         if (flag) {
             return i;
         }
     }return 0;
    }
}
