public class IntegerObjectToString {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(987); // Use Integer.valueOf()
        String str1 = intObj.toString();
        String str2 = String.valueOf(intObj);

        System.out.println("Integer object to String (toString()): " + str1);
        System.out.println("Integer object to String (valueOf()): " + str2);
    }
}