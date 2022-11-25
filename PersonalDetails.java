
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> year = new ArrayList<>();
        int count = 0;
        int sum = 0;
        
        while(true){
            String input = scanner.nextLine();
                        
            if (input.equals("")){
                break;
            } else {
                String [] broken = input.split(",");
                name.add(broken[0]);
                year.add(Integer.valueOf(broken[1]));
                              
            }
                       
        }
        int longest = name.get(0).length();
        int index = 0;
        
        for (int i=0; i < name.size(); i++) {
            if (longest < name.get(i).length()) {
                longest = name.get(i).length();
                index = i;
            }
            sum += year.get(i);
            count++;
        }
        double avg = (1.0*sum)/count;
        System.out.println("Longest name: " + name.get(index));
        System.out.println("Average of the birth years: " + avg);


    }
}
