public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}