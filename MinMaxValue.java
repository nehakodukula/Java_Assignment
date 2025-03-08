public class MinMaxValue {

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // Or throw an exception
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; // Or throw an exception
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 5, 30, 15, 50};
        int min = findMin(myArray);
        int max = findMax(myArray);
        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }
}