public class NumberToString {
    public static void main(String[] args) {
        int num1 = 123;
        double num2 = 45.67;
        boolean bool = true;

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        String str3 = String.valueOf(bool);

        System.out.println("Integer to String: " + str1);
        System.out.println("Double to String: " + str2);
        System.out.println("Boolean to String: " + str3);
    }
}