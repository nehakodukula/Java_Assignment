import java.util.ArrayList;
import java.util.List;

public class ArraysList {

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                    break; // Avoid adding the same duplicate multiple times
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 20, 40, 50, 10};
        List<Integer> duplicateList = findDuplicates(myArray);
        System.out.println("Duplicates: " + duplicateList);
    }
}