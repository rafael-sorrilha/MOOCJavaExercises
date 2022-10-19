
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int result = 0;
        int one = Integer.valueOf(scanner.nextLine());
        for (int start = 0; one >= start; start++) {
            result += one - start;
        }
        System.out.println("The sum is " + result);

    }
}
