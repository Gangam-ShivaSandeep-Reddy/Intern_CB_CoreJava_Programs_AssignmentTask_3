package AnimalHierarchy_Abstraction_Polymorphism;

public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Concrete method
    public void eat() {
        System.out.println("The animal is eating.");
    }

    // Concrete method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
