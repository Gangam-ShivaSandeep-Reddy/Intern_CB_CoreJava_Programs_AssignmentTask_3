package LinkedListofStrings_ARPOperations;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingList {
	private LinkedList<String> shoppingList;

	public ShoppingList() {
		shoppingList = new LinkedList<>();
	}

	public void addItem(String item) {
		shoppingList.add(item);
		System.out.println("Added: " + item);
	}


	public void addItemAtBeginning(String item) {
		shoppingList.addFirst(item);
		System.out.println("Added at beginning: " + item);
	}

	public void removeItem(String item) {
		if (shoppingList.remove(item)) {
			System.out.println("Item '" + item + "' removed.");
		} else {
			System.out.println("Item '" + item + "' not found.");
		}
	}


	public void printList() {
		System.out.println("Current Shopping List: " + shoppingList);
	}

	public static void main(String[] args) {
		ShoppingList shoppingList = new ShoppingList();
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the item to add to the list: ");
		shoppingList.addItem(scanner.nextLine());
		System.out.print("Enter the item to add to the list: ");
		shoppingList.addItem(scanner.nextLine());
		System.out.print("Enter the item to add to the list: ");
		shoppingList.addItem(scanner.nextLine());


		shoppingList.printList();


		System.out.print("Do you want to remove an item? (yes/no): ");
		if (scanner.nextLine().equalsIgnoreCase("yes")) {
			System.out.print("Enter the item to remove: ");
			shoppingList.removeItem(scanner.nextLine());
		}


		shoppingList.printList();


	}
}



