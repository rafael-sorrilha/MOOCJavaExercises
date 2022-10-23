

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);

    }
    public static void printUntilNumber(int number) {
        int one = 0;
        while (one < number) {
            one++;
            System.out.println(one);
        }
    }
    
   

}
