import java.util.Arrays;

public class Secondlargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println("Second largest number: " + findSecondLargest(arr));
    }
}