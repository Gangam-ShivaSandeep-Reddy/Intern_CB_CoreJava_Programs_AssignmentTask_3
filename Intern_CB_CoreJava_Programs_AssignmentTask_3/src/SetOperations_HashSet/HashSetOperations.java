package SetOperations_HashSet;

import java.util.HashSet;

public class HashSetOperations {

	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("orange");

		System.out.println("Initial Set: " + set);

		String toRemove = "banana";
		if (set.remove(toRemove)) {
			System.out.println("Removed '" + toRemove + "' from the set.");
		} else {
			System.out.println("'" + toRemove + "' was not found in the set.");
		}
		System.out.println("Set after removal: " + set);

		
		String toCheck = "orange";
		if (set.contains(toCheck)) {
			System.out.println("'" + toCheck + "' exists in the set: true");
		} else {
			System.out.println("'" + toCheck + "' exists in the set: false");
		}
	}
}



