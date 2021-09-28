package Basic;

import java.util.Scanner;

/*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
public class Operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Input Two numbers  and an operator in new Line:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0);
        int res=0;
        if(op=='+'){
            res= num1+num2;
        }
        if(op=='-'){
            res= num1-num2;
        }
        if(op=='*'){
            res= num1*num2;
        }
        if(op=='/'){
            if(num2>0) {
                res = num1 / num2;
            }else{
                System.out.println("Invalid");
            }
        }
        else if(op!= '+' || op!= '-' || op!= '*' || op!='/'){
            System.out.println("Invalid choice");
        }
        System.out.println(" Ans : " +res);

    }
}
