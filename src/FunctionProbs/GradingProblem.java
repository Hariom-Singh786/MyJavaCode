package FunctionProbs;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
public class GradingProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name= sc.next().trim();
        System.out.print("Inter Number of Subject :");
        int n=sc.nextInt();
        System.out.print("Input Marks of "+n+ " Subjects out of 100 :");
        int sum=0;
        for(int i=1;i<=n;i++){
            int marks=sc.nextInt();
            if(marks>100){
                System.err.println("Please Enter marks out of 100 !");
                break;
            }
            sum+=marks;
        }
        float per= sum/n;
        String ans= displayGrade(per);
        System.out.println("you got "+per +"% marks and Your Grade is :"+ans);
//        System.out.print("Input your Total Marks out of 100 :");
//        int marks=sc.nextInt();
//        if(marks>100){
//            System.out.println("Please Enter your marks out of 100");
//        }
//        if(marks<=100){
//           String result= display(marks);
//            System.out.println(result);
//        }
//    }
//    /*Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail */
//    private static String display(int marks) {
//        if (marks >= 91 && marks <= 100) {
//            // System.out.println(" AA");
//            return "AA";
//        }
//        if (marks >= 81 && marks <= 90) {
////            System.out.println(" AB");
//            return "AB";
//        }
//        if (marks >= 71 && marks <= 80) {
////            System.out.println(" BB");
//            return "BB";
//        }
//        if (marks >= 61 && marks <= 70) {
////            System.out.println(" BC");
//            return "BC";
//        }
//        if (marks >= 51 && marks <= 60) {
////            System.out.println(" CD");
//            return "CD";
//        }
//        if (marks >= 41 && marks <= 50) {
////            System.out.println(" DD");
//            return "DD";
//        }
//        //            System.out.println("Fail");
//        return "Fail";
    }

    private static String displayGrade(float per) {
        if (per>= 91 && per <= 100) {
            // System.out.println(" AA");
            return "AA";
        }
        if (per >= 81 && per <= 90) {
//            System.out.println(" AB");
            return "AB";
        }
        if (per >= 71 && per <= 80) {
//            System.out.println(" BB");
            return "BB";
        }
        if (per >= 61 && per<= 70) {
//            System.out.println(" BC");
            return "BC";
        }
        if (per >= 51 && per <= 60) {
//            System.out.println(" CD");
            return "CD";
        }
        if (per >= 41 && per <= 50) {
//            System.out.println(" DD");
            return "DD";
        }
        //            System.out.println("Fail");
        return "Fail";
    }
}
