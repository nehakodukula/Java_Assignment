public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}