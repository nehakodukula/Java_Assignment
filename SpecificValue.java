public class SpecificValue {

    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        boolean contains = containsValue(myArray, 30);
        System.out.println("Array contains 30: " + contains);
    }
}