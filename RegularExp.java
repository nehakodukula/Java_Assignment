public class RegularExp {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "abcde";

        System.out.println("str1 matches digits only: " + str1.matches("\\d+"));
        System.out.println("str2 matches digits only: " + str2.matches("\\d+"));
        System.out.println("str2 matches lowercase letters only: " + str2.matches("[a-z]+"));
    }
}