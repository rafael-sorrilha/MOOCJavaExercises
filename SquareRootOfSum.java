
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.valueOf(scanner.nextLine());
        int two = Integer.valueOf(scanner.nextLine());
        double squarert = Math.sqrt(one + two);
        System.out.println(squarert);

    }
}
