public class ArrayOperations2 {

    public static double averageArray(int[] arr) {
        if (arr.length == 0) {
            return 0; // Avoid division by zero
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        double result = averageArray(myArray);
        System.out.println("Average of array elements: " + result);
    }
}