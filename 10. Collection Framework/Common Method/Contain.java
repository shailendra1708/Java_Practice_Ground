// Java code to illustrate boolean contains() method

import java.util.*; 
 class Contain {
	public static void main(String args[]) 
	{ 

		// creating an empty LinkedList 
		Collection<String> list = new LinkedList<String>(); 

		// use add() method to add elements in the list 
		list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 

		// Output the present list 
		System.out.println("The list is: " + list); 

		// Checking the presence of Geeks 
		// using contains() method 
		boolean result = list.contains("Geeks"); 

		// printing the result 
		System.out.println("Is Geeks present in the List: "
						+ result); 
	}
    
}
