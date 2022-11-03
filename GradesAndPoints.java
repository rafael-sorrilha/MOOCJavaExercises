
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int one = Integer.valueOf(scan.nextLine());
        
        
            
        if (one < 0) {
            System.out.println("impossible");
        }
        if (one >= 0 && one <= 49) {
            System.out.println("failed");
        } else if (one >= 50 && one <= 59) {
            System.out.println("1");
        } else if (one >= 60 && one <= 69) {
            System.out.println("2");
        } else if (one >= 70 && one <= 79) {
            System.out.println("3");
        } else if (one >= 80 && one <= 89) {
            System.out.println("4");
        } else if (one >= 90 && one <= 100) {
            System.out.println("5");
        } else if (one > 100){
            System.out.println("incredible");   
        }
           

    }
}
