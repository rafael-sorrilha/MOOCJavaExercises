
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        double twos = 0;
        while (true) {
            int one = Integer.valueOf(scanner.nextLine());
            if (one > 0) {
                ones = ones + 1;
                twos = twos + one;
                continue;
            } else if (one == 0) {
                System.out.println("Cannot calculate the average");
                break;
                
            }
        }
        System.out.println(twos/ones);

    }
}
