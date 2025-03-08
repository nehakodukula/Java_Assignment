class Parent1 {
    Parent1() {
        System.out.println("Parent Default Constructor");
    }

    Parent1(int x) {
        System.out.println("Parent Argument Constructor: " + x);
    }
}

class Child extends Parent1 {
    Child() {
        super();  // Calls Parent default constructor
        System.out.println("Child Default Constructor");
    }

    Child(int y) {
        super(y);  // Calls Parent argument constructor
        System.out.println("Child Argument Constructor: " + y);
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        Child obj2 = new Child(50);
    }
}