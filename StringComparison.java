public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "HelloWorld";

        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));
        System.out.println("str3 startsWith Hello: " + str3.startsWith("Hello"));
        System.out.println("str3 endsWith World: " + str3.endsWith("World"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // Case-sensitive comparison
    }
}