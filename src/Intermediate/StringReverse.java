package Intermediate;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
//        String str=" Hariom kidhar gaye ";
//        char[] result= str.toCharArray();
//        for(int i=result.length-1;i>=0;i--){
//            System.out.print(result[i]);
//        }
        //java program to reverse a string using swapping a variable
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Input a String :");
//        String str=sc.next();
//        char [] tempo=str.toCharArray();
//        int left,right;
//        right=tempo.length -1;
//        left=0;
//        for(left=0;left<right;left++,right--){
//            char swap=tempo[left];
//            tempo[left]=tempo[right];
//            tempo[right]=swap;
//           // System.out.print(tempo);
//        }
//        for(char n:tempo){
//            System.out.print(n);
//        }

        //java program to reverse a string using String Builder method
        String  str="Hariom singh";
        StringBuilder rev= new StringBuilder();
        rev.append(str);
        rev.reverse();
        System.out.println(rev);

    }
}
