package FunctionProbs;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class PalindromeFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a number :");
        int num= sc.nextInt();
        boolean res=palindrome(num);
        if(res==true){
            System.out.println(num+" is Palindrome");
        }
        if(res==false){
            System.out.println(num+" is not Palindrome");
        }
    }
    private static boolean palindrome(int num) {
        int temp=num;
        int dig;
        int reverse=0;
        while(num>0){
            dig=num%10;
            num/=10;
            reverse=reverse*10+dig;
        }
        if(temp==reverse){
            return true;
        }else{
            return false;
        }
    }
}
