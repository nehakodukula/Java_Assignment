// Abstract class with abstract and non-abstract methods
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        System.out.println("Abstract class with abstract and non-abstract methods defined.");
    }
}