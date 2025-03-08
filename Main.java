class Parent {
    int parentValue = 100;
}

class Example2 extends Parent {
    void display() {
        System.out.println("Using super to access parent class field: " + super.parentValue);
    }
}

public class Main {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display();
    }
}