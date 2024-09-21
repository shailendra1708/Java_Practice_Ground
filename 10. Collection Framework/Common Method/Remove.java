// Java program to demonstrate removing
// elements from a Collection

import java.util.*;

public class Remove {
	public static void main(String[] argv) throws Exception
	{

		// Creating object of HashSet<Integer>
		Collection<Integer> set1 = new HashSet<Integer>();

		// Populating arrset1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		// print set1
		System.out.println("Initial set1 : " + set1);
		
		// remove a particular element
		set1.remove(4);
	
		// print modified set1
		System.out.println("set1 after removing 4 : " + set1);
	
		// Creating another object of HashSet<Integer>
		Collection<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);

		// print set2
		System.out.println("Collection Elements to be removed : " + set2);

		// Removing elements from set1
		// specified in set2
		// using removeAll() method
		set1.removeAll(set2);

		// print arrset1
		System.out.println("set 1 after removeAll() operation : " + set1);
	}
}
