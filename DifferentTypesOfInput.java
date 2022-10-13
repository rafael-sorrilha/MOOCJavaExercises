
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give an integer:");
        int one = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double two = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean three = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string "+ text);
        System.out.println("You gave the integer "+ one);
        System.out.println("You gave the double "+ two);
        System.out.println("You gave the boolean "+ three);

        // Write your program here

    }
}
