package Intermediate;

import java.util.Scanner;

public class SumOfDifferentNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input value of n :");
        int n=sc.nextInt();
        System.out.print("Input set Of Numbers :");
        int [] arr= new int[n];
        int posEven=0;
        int posOdd=0;
        int negSum=0;
        while(true) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==0){
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && arr[i]>0) {
                        posEven+=arr[i];
                }
                if(arr[i]<0){
                    negSum+=arr[i];
                }if(arr[i]%2!=0 && arr[i]>0){
                    posOdd+=arr[i];
                }
            }
            System.out.println("Positive Even :"+posEven);
            System.out.println("Positive Odd :"+posOdd);
            System.out.println("Sum of Negative Numbers :"+negSum);
        }
    }
}
