package Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number :");
        int num = sc.nextInt();
        int temp = num;
        int res = 0;
//        while (true) {
            while (num > 0) {
                int rem = num % 10;
                num /= 10;
                res = (res * 10) + rem;
            }
            if (res == temp) {
                System.out.println(res + " is Palindrome");
            } else {
                System.out.println(res + " is not palindrome");
            }
        }
//    }
}
