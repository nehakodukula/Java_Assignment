import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");


        list.add("Kiwi");
        System.out.println("After adding an element: " + list);
        System.out.print("Iterating through ArrayList: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        list.add(2, "Blueberry");
        System.out.println("After adding at index 2: " + list);
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);
        list.set(4, "Mango");
        System.out.println("After updating index 4: " + list);

        int index = 5;
        if (index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Index out of range.");
        }
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size of ArrayList: " + list.size());
        String searchElement = "Mango";
        System.out.println("Is '" + searchElement + "' present? " + list.contains(searchElement));

        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}