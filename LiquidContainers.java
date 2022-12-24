
import java.util.Scanner;


public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerA = 0;
        int containerB = 0;
        
        while (true) {
            System.out.print("First: " + containerA +"/100" +"\n"+ "Second: " + containerB + "/100"+"\n");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                if (amount <= 0) {
                    containerA = containerA;
                } else if (containerA + amount < 100){
                    containerA += amount;
                } else if (containerA + amount >= 100){
                    containerA = 100;
                }
                
            } else if (command.equals("move")){
                if (amount <= 0 || containerA == 0){
                    containerA = containerA;
                } else if (amount >= 100){
                    containerA = 0;
                    containerB = 100;
                } else if (containerA - amount < 0 && containerB + containerA < 100){
                    amount = containerA;
                    containerB += amount;
                } else if (containerB + amount <= 100){
                    containerA -= amount;
                    containerB += amount;
                } else if (amount + containerB > 100 && amount + containerA > 100) {
                    containerB = 100;
                    containerA = 0;
                }
                
            } else if (command.contains("remove")){
                if (containerB - amount < 0){
                    containerB = 0;
                } else {
                    containerB -= amount;
                }
                
            }

        }
    }

}
