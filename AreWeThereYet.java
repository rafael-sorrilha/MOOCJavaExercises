
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int one = Integer.valueOf(scanner.nextLine());
            if (one == 4) {
                break;
            }
        }

    }
}
