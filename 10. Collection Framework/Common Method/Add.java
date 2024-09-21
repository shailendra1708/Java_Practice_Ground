// add and addAll Method

import java.util.ArrayList;
import java.util.Collection;

public class Add {
    public static void main(String[] args) {
        // Create a collection (ArrayList)
        Collection<String> fruits = new ArrayList<>();
        
        // Add individual elements using add()
        fruits.add("Apple");
        fruits.add("Banana");
        
        // Create another collection
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Mango");
        
        // Add all elements from moreFruits using addAll()
        fruits.addAll(moreFruits);
        
        System.out.println("Fruits: " + fruits);
    }
}


