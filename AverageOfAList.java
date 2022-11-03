
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            list.add(userInput);
        }
        int avg = 0;
        for (Integer r : list) {
            avg += r;
        }
        System.out.println("Average: " + avg/(double)list.size());
        
       
        
    }
}
