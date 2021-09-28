package FunctionProbs;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class Vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Your Age :");
        int age=sc.nextInt();
        elegible(age);
    }
    private static void elegible(int age) {
        if(age>=18){
            System.out.println("You are eligible for Voting");
        }else{
            System.out.println("You are not eligible for Voting");
        }
    }
}

