
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        int start = numbers.get(Integer.valueOf(scanner.nextLine()));
        int end = numbers.get(Integer.valueOf(scanner.nextLine()));
        System.out.println("From where? " + start);
        System.out.println("To where? " + end);
        

    }
}
