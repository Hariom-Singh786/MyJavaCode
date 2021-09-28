package Intermediate;
import java.util.Scanner;
public class FindPerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a Number :");
        int in=sc.nextInt();
        int sum=0;
        for(int i=1;i<=in/2;i++){
            if(in%i==0){
              sum+=i;
            }
        }
        if(in==sum){
            System.out.println(in +" is Perfect Number");
        }else{
            System.out.println(in+ " is not A Perfect Number");
        }
    }
}
