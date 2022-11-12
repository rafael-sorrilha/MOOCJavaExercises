
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String [] broken = input.split(" ");
            
            for (String i : broken) {
                System.out.println(i);
            }
            if (input.equals("")) {
            break;
            }
        }
        
    }
}
