package Intermediate;

import java.util.Scanner;

public class VovelOrConsonent {
    public static void main(String[] args) {
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.print("Input any alphabet :");
            char in=sc.next().trim().charAt(0);
            if(in>='a' && in<='z' || in>='A' && in<='Z'){
                if((in=='a'|| in=='e' ||in=='o' || in=='u' || in=='i') ||in=='A'|| in=='E' ||in=='O' || in=='U' || in=='I' ){
                    System.out.println( in+ " is Vowel");
                }else{
                    System.out.println(in +" is Consonent");
                }
            }else{
                break;
            }

        }
    }
}
