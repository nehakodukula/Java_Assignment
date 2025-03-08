public class VerifyElemnets {
    public static boolean containsElements(int[] arr, int x, int y) {
        boolean foundX = false, foundY = false;
        for (int num : arr) {
            if (num == x) foundX = true;
            if (num == y) foundY = true;
        }
        return foundX && foundY;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 23, 45, 67};
        System.out.println("Contains 12 and 23: " + containsElements(arr, 12, 23));
    }
}