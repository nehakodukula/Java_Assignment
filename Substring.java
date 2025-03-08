public class Substring {
    public static void main(String[] args) {
        String str = "Programming in Java";
        String sub1 = str.substring(15); // Extracts from index 15 to end
        String sub2 = str.substring(0, 11); // Extracts from index 0 to 10 (exclusive of 11)

        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
    }
}