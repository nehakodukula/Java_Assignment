class Parent5 {
    int parentVar;

    Parent5() {
        System.out.println("Parent's default constructor called");
        this.parentVar = 100; // Initialize parentVar in the default constructor
    }

    Parent5(int value) {
        System.out.println("Parent's parameterized constructor called with value: " + value);
        this.parentVar = value;
    }
}

class Child1 extends Parent5 {
    int childVar;

    Child1() {
        super(); // Calls the parent's default constructor
        System.out.println("Child's default constructor called");
        this.childVar = 200;
    }

    Child1(int value) {
        super(value); 
        System.out.println("Child's parameterized constructor called with value: " + value);
        this.childVar = value * 2;
    }

    void printValues() {
        System.out.println("Parent's parentVar: " + super.parentVar);
        System.out.println("Child's childVar: " + this.childVar);
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.printValues();

        Child1 child2 = new Child1(50); 
        child2.printValues();
    }
}