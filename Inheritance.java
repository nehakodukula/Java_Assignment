// Parent class
class A {
    String name = "Class A";

    void a() {
        System.out.println("Method a in Class A");
    }

    void b() {
        System.out.println("Method b in Class A");
    }

    void c() {
        System.out.println("Method c in Class A");
    }

    // Getter method for name to allow polymorphic behavior
    String getName() {
        return name;
    }
}

// Child class B extending A
class B extends A {
    String name = "Class B";

    @Override
    void a() {
        System.out.println("Method a in Class B");
    }

    @Override
    void b() {
        System.out.println("Method b in Class B");
    }

    @Override
    void c() {
        System.out.println("Method c in Class B");
    }

    @Override
    String getName() {
        return name;
    }
}

// Child class C extending B
class C extends B {
    String name = "Class C";

    @Override
    void a() {
        System.out.println("Method a in Class C");
    }

    @Override
    void b() {
        System.out.println("Method b in Class C");
    }

    @Override
    void c() {
        System.out.println("Method c in Class C");
    }

    @Override
    String getName() {
        return name;
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        A aObj = new A();
        B bObj = new B();
        C cObj = new C();

        // Calling methods using instances
        aObj.a();
        aObj.b();
        aObj.c();

        bObj.a();
        bObj.b();
        bObj.c();

        cObj.a();
        cObj.b();
        cObj.c();

        // Using parent class references for child objects
        A bRef = new B();
        A cRef = new C();

        bRef.c();  // Calls overridden method in B
        cRef.c();  // Calls overridden method in C

        // Correct way to get class-specific names using getter method
        System.out.println("bRef's name: " + bRef.getName());
        System.out.println("cRef's name: " + cRef.getName());
    }
}