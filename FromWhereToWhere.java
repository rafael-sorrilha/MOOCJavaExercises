
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int one = Integer.valueOf(scanner.nextLine());
        for (int start = one; end >= start; start++) {
            System.out.println(start);
        }

        // Write your program here
    }
}
