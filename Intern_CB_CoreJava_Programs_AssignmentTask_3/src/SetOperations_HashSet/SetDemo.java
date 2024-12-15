package SetOperations_HashSet;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String>fruitsSet = new HashSet<String>();
		fruitsSet.add("apple");
		fruitsSet.add("banana");
		fruitsSet.add("orange");
		System.out.println(fruitsSet);

		fruitsSet.add("mango");
		fruitsSet.add("grapes");

		fruitsSet.remove("banana");


		System.out.println(fruitsSet.isEmpty());
		System.out.println(fruitsSet.contains("orrange"));
		//     System.out.println(fruitsSet.co);


		System.out.println(fruitsSet);

		System.out.println("*******************");

		for(String str: fruitsSet) {
			System.out.println(str);
		}



	}
}
