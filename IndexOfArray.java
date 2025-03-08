public class IndexOfArray {

    public static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int index = findIndex(myArray, 30);
        System.out.println("Index of 30: " + index);
    }
}