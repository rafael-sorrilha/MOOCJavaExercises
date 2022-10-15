
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int one = Integer.valueOf(scan.nextLine());
        
        if (one < 5000) {
            System.out.println("No tax!");
        } else if (one >= 5000 && one < 25000) {
            System.out.println("Tax: " + (100 + (one-5000) * 0.08));
        } else if (one >= 25000 && one < 55000) {
            System.out.println("Tax: " + (1700 + (one-25000) * 0.1));
        } else if (one >= 55000 && one < 200000) {
            System.out.println("Tax: " + (4700 + (one-55000) * 0.12));
        } else if (one >= 200000 && one < 1000000) {
            System.out.println("Tax: " + (22100 + (one-200000) * 0.15));
        } else if (one >= 1000000) {
            System.out.println("Tax: " + (142100 + (one - 1000000) * 0.17));
        }

    }
}
