import java.util.Arrays;

public class Difference {
    public static int findDifference(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 3};
        System.out.println("Difference between largest and smallest: " + findDifference(arr));
    }
} 
