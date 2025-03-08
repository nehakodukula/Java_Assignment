public class MissingNumbers {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 57; // Example missing number
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missing) arr[index++] = i;
        }
        System.out.println("Missing number: " + findMissingNumber(arr, 100));
    }
}