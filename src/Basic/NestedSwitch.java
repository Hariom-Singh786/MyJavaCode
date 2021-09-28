package Basic;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Employee Id :");
        int id= in.nextInt();
        System.out.print("Enter  Designation :");
        String post=in.next();
        switch (id) {
            case 1 -> System.out.println("Mahendra singh Rajawat");
            case 2 -> System.out.println("Mahima Darling");
            case 3 -> {
                System.out.println("Sunny Leone");
                switch (post) {
                    case "IT" -> System.out.println("Information technology");
                    case "actress" -> System.out.println("Film Star");
                    case "teacher" -> System.out.println("Teacher");
                    default -> System.out.println("data not found !");
                }
            }
            default -> System.out.println("Employee not Registered");
        }

    }
}
