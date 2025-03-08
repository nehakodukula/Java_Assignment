public class StringCaseConversion {
    public static void main(String[] args) {
        String str = "MixedCaseString";

        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();

        System.out.println("Original String: " + str);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }
}