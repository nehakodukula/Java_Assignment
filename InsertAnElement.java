import java.util.Arrays;

public class InsertAnElement {

    public static int[] insertElement(int[] arr, int element, int position) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, position);
        newArray[position] = element;
        System.arraycopy(arr, position, newArray, position + 1, arr.length - position);
        return newArray;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int[] newArray = insertElement(myArray, 25, 2);
        System.out.println("Array after inserting 25 at position 2: " + Arrays.toString(newArray));
    }
}