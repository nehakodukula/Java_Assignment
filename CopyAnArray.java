import java.util.Arrays;

public class CopyAnArray {

    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int[] copiedArray = copyArray(myArray);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}