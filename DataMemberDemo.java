// Superclass A
class A {
    int data = 10;
}

// Subclass B
class B extends A {
    int data = 20;
}

// Subclass C
class C extends B {
    int data = 30;
}

// Main class
public class DataMemberDemo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("objA.data: " + objA.data);
        System.out.println("objB.data: " + objB.data);
        System.out.println("objC.data: " + objC.data);

        // Accessing data members using superclass reference
        A refB = new B();
        A refC = new C();
        System.out.println("refB.data: " + refB.data); // Accesses A's data
        System.out.println("refC.data: " + refC.data); // Accesses A's data
    }
}