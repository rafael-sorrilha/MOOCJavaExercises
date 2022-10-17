
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        while (true) {
            System.out.println("Give a number:");
            int one = Integer.valueOf(scanner.nextLine());
            if (one < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (one == 0) {
                break;
            } else if (one > 0) {
                System.out.println(one*one);
            }
        }

    }
}
