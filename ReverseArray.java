import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int[] reversedArray = reverseArray(myArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}