import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int e : array){
            if (e < smallest){
                smallest = e;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        int smallestIndex = 0;
        for (int e : array){
            if (e < smallest){
                smallest = e;
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int one = table[startIndex];
        int index = 0;
        for (int i = startIndex; i < table.length; i++){
            if (table[i] <= one){
                one = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
        
    }
    
    public static void sort(int[] array) {
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        
        for (int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println("After first sort " + Arrays.toString(array));
        }
    }

}
