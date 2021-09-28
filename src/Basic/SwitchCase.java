package Basic;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Input Any Fruit :");
        Scanner in= new Scanner(System.in);
        String fruit= in.next();
        switch (fruit) {
            case "Apple" -> System.out.println("A sweet fruit");
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("A well rounded Fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("I will add more Fruits later");
        }
    }
}
