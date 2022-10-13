
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int one = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int two = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int three = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (Double.valueOf(one+two+three))/3);

        // Write your program here

    }
}
