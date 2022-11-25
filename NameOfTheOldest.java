

import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            String [] broken = input.split(",");
            
            if (input.equals("")){
                break;
            } else {
                name.add(broken[0]);
                age.add(Integer.valueOf(broken[1]));
                
            }
        }
            int largest = age.get(0);
            String oldest = name.get(0);
            for (int i = 0; i < age.size(); i++){
                int number = age.get(i);
                if (largest < number){
                    oldest = name.get(i);
                    largest = age.get(i);
                }
            }
        
        System.out.println("Name of the oldest: " + oldest);

    }
}
