
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int one = 0; number > one; one++) {
            System.out.print("*");
        }
        System.out.println();
             
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int two = 0;
        while (two < size) {
            printStars(size);
            two++;
                   
        }
               
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int three = width;
        while (three > height) {
            printStars(width);
            height++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int four = 1;
        while (size >= four) {
            printStars(four);
            four++;
        }
          
    }
}
