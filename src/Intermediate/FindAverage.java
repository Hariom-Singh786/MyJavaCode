package Intermediate;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class FindAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        int sum=0;
        while(true){
            System.out.print("input :");
            int in=sc.nextInt();
            if(in==0){
                break;
            }
            sum+=in;
            count++;

        }
        System.out.println("Average of Numbers is :"+(sum/count));
    }
}
