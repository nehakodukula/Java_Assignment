import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
     
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Emma");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Isaac");
        studentMap.put(110, "Jack");


        studentMap.put(111, "Kelly");

        int keyToFetch = 103;
        System.out.println("Value for key " + keyToFetch + ": " + studentMap.get(keyToFetch));

        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);

        int keyToCheck = 105;
        System.out.println("Key " + keyToCheck + " is present: " + studentMap.containsKey(keyToCheck));

        String valueToCheck = "Emma";
        System.out.println("Value \"" + valueToCheck + "\" is present: " + studentMap.containsValue(valueToCheck));

        System.out.println("Is the map empty? " + studentMap.isEmpty());

        System.out.println("Size of the map: " + studentMap.size());

        System.out.println("Keys in the map: " + studentMap.keySet());

        System.out.println("Values in the map: " + studentMap.values());

        int keyToRemove = 108;
        studentMap.remove(keyToRemove);
        System.out.println("After removing key " + keyToRemove + ", map: " + studentMap);

        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);
        System.out.println("Copied map: " + anotherMap);
    }
}