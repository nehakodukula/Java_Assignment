

import java.util.*; // Keep your imports

interface MyInterface {
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Method from interface implemented.");
    }
}

class display { // Class name should match the file name.
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}