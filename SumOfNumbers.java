// Write a program that reads numbers from the user until the user inputs a number 0. 
// After this the program outputs the sum of the numbers. 
// The number zero does not need to be added to the sum, even if it does not change the results.


import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        while (true) {
            System.out.println("Give a number:");
            int one = Integer.valueOf(scanner.nextLine());
            if (one != 0) {
                ones = ones + one;
                continue;
            } else if (one == 0) {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + ones);

    }
}
