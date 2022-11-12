
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String [] broken = input.split(" ");
            if (input.equals("")) {
                break;
            } else if (!(input.equals(""))){
                System.out.println(broken[0]);
            
            }
        }


    }
}
