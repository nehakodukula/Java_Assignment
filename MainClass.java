// Abstract class with an abstract and a non-abstract method
abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();
}

// Child class extending the abstract class
class ChildClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildClass.");
    }
}

// Main class
public class MainClass {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

        obj.abstractMethod();
    }
}