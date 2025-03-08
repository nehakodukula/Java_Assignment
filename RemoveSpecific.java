import java.util.Arrays;

public class RemoveSpecific {

    public static int[] removeElement(int[] arr, int element) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int num : arr) {
            if (num != element) {
                temp[j++] = num;
            }
        }
        return Arrays.copyOf(temp, j); // Resize the array to remove extra space
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int[] newArray = removeElement(myArray, 30);
        System.out.println("Array after removing 30: " + Arrays.toString(newArray));
    }
}