import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupNewArray {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 5, 2, 1};
        int[] newArr = removeDuplicates(arr);
        System.out.println("New array without duplicates: " + Arrays.toString(newArr));
    }
}