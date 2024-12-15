package AnimalHierarchy_Abstraction_Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.sound();
		cat.sound();

		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}



