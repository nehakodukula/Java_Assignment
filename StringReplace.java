public class StringReplace {
    public static void main(String[] args) {
        String str = "Replace all 'a' with 'e'";
        String replaced = str.replace('a', 'e');
        System.out.println("Original: " + str);
        System.out.println("Replaced: " + replaced);
    }
}