
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            
        }
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Search for? " + start);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == start) {
                System.out.println(start + " is at index " + i);
            }
        }
        
        
        
      
    }
}
