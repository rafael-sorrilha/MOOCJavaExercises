
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.next());
        int one,fact = 1;
        for (one = 1; input >= one; one++) {
            fact = fact*one;
        }
        System.out.println("Factorial: " + fact);
    

    }
}
