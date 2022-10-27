
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; number > i; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; number > i; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int k = size - 1;
        
        while (i <= size) {
            printSpaces(k);
            printStars(i);
            k--;
            i++;
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int k = height - 1;
        
        while (i <= height) {
            printSpaces(k);
            printStars(i*2-1);
            i++;
            k--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
