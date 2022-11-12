
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index != array.length -1) {
                System.out.print(", ");
            }
        }
    }
}
