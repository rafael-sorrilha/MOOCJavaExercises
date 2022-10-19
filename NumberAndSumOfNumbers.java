
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        int twos = 0;
        while (true) {
            System.out.println("Give a number:");
            int one = Integer.valueOf(scanner.nextLine());
            
            if (one != 0) {
                ones = ones + 1;
                twos = twos + one;
                continue;
            } else if (one == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + ones);
        System.out.println("Sum of the numbers: " + twos);
        

    }
}
