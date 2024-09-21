import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod{
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Get the iterator
        Iterator<String> it = list.iterator();

        // Iterate over the elements
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
            
            // Remove "Banana" from the list
            if (fruit.equals("Banana")) {
                it.remove();
            }
        }

        System.out.println("After removal: " + list);
    }
}
