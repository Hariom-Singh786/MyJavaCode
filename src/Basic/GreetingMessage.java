package Basic;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Your Name please :");
        String name= in.next().trim();
        System.out.println(" Nice to Meet you  :)  " +name);

    }
}
