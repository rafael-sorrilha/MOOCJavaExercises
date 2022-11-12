
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            String [] broken = input.split(",");
            int count = 0;
            if (!(input.equals(""))){
                name.add(broken[0]);
                age.add(Integer.valueOf(broken[1]));
                count++;
            } else if (input.equals("")) {
                break;
            }
        }
            int oldest = age.get(0);
            for (int i = 0; i < age.size(); i++){
                int number = age.get(i);
                if (oldest < number){
                    oldest = age.get(i);
                }
            }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
