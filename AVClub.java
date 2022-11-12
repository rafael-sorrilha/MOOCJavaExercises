
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            String [] splitInput = input.split(" ");
            if (input.equals("")) {
                break;
            }
            for (String i : splitInput) {
                if (i.contains("av")){ 
                    System.out.println(i);
                }
            }
            
        }


    }
}
