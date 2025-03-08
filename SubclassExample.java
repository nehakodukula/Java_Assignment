// Abstract class Animal
abstract class Animals {
    // Abstract method
    abstract void makeSound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


public class SubclassExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); 
        myDog.sleep();     
    }
}