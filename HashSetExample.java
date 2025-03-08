import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
      
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Indian Fig");
        fruits.add("Jackfruit");

   
        System.out.println("HashSet elements: " + fruits);

        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

  
        System.out.println("Size of HashSet: " + fruits.size());

    
        System.out.println("Iterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Is HashSet empty? " + fruits.isEmpty());

   
        fruits.clear();
        System.out.println("After clearing, is HashSet empty? " + fruits.isEmpty());
    }
}