public class IndexOfString
 {
    public static void main(String[] args) {
        String str = "Java is a powerful language. Java is widely used.";
        int index1 = str.indexOf("Java"); // First occurrence
        int index2 = str.indexOf("Java", 1); // Starting from index 1
        int index3 = str.indexOf("Python"); // Not found

        System.out.println("First 'Java' found at: " + index1);
        System.out.println("Second 'Java' found at: " + index2);
        System.out.println("'Python' found at: " + index3); // Returns -1 if not found
    }
}