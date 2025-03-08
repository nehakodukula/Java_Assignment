public class StringCreation {
    public static void main(String[] args) {
        // 1. String Literal
        String str1 = "Hello, World!";
        System.out.println("String Literal: " + str1);

        // 2. Using the 'new' keyword
        String str2 = new String("Java Programming");
        System.out.println("Using 'new': " + str2);

        // 3. Character Array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        System.out.println("From char array: " + str3);

        // 4. Using StringBuilder (mutable string)
        StringBuilder sb = new StringBuilder("Mutable String");
        String str4 = sb.toString();
        System.out.println("From StringBuilder: " + str4);
    }
}