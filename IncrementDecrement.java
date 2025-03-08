public class IncrementDecrement {
    public static void incrementDecrement(int num) {
        System.out.println("Original number: " + num);

        // Post-increment
        System.out.println("Post-increment: " + num++); 
        System.out.println("After post-increment: " + num);

        // Pre-increment
        System.out.println("Pre-increment: " + ++num);

        // Post-decrement
        System.out.println("Post-decrement: " + num--);
        System.out.println("After post-decrement: " + num);

        // Pre-decrement
        System.out.println("Pre-decrement: " + --num);
    }

    public static void main(String[] args) {
        incrementDecrement(5);
    }
}
