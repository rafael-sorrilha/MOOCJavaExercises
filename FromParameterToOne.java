

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);


    }
    public static void printFromNumberToOne(int number) {
        int one = 1;
        System.out.println(number);
        while (one < number) {
            number--;
            System.out.println(number);
        }
    }

}
