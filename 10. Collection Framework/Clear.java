import java.util.ArrayList;
import java.util.Arrays;

public class Clear {
	public static void main(String[] args) {
		// Create an ArrayList and initialize it with some elements
		ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));

		// Display the list before clearing
		System.out.println("List before clearing: " + list);

		// Clear the list
		list.clear();

		// Display the list after clearing
		System.out.println("List after clearing: " + list);
	}
}

