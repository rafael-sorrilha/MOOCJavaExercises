
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        String scndinput = scanner.nextLine();
        System.out.println("Search for? " + scndinput);
        if (list.contains(scndinput)) {
            System.out.println(scndinput + "was found!");
        } else {
            System.out.println(scndinput + "was not found!");
        }

    }
}
