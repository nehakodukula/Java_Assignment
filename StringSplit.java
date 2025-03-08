public class StringSplit {
    public static void main(String[] args) {
        String str = "apple,banana,orange,grape";
        String[] fruits = str.split(",");

        System.out.println("Fruits after splitting:");
        for (String fruit : fruits) {
            System.out.println(fruit.trim()); // Trim to remove extra spaces
        }

        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");

        System.out.println("\nWords after splitting:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}