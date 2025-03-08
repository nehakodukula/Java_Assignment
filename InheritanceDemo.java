// Superclass A
import java.util.*;
class A {
    void method1() {
        System.out.println("A's method1");
    }

    void method2() {
        System.out.println("A's method2");
    }

    void overrideMethod() {
        System.out.println("A's overrideMethod");
    }
}

// Subclass B
class B extends A {
    void method3() {
        System.out.println("B's method3");
    }

    void method4() {
        System.out.println("B's method4");
    }

    @Override
    void overrideMethod() {
        System.out.println("B's overrideMethod");
    }
}

// Subclass C
class C extends B {
    void method5() {
        System.out.println("C's method5");
    }

    void method6() {
        System.out.println("C's method6");
    }

    @Override
    void overrideMethod() {
        System.out.println("C's overrideMethod");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods using their own objects
        objA.method1();
        objA.method2();
        objA.overrideMethod();

        objB.method1(); // Inherited from A
        objB.method2(); // Inherited from A
        objB.method3();
        objB.method4();
        objB.overrideMethod();

        objC.method1(); // Inherited from A
        objC.method2(); // Inherited from A
        objC.method3(); // Inherited from B
        objC.method4(); // Inherited from B
        objC.method5();
        objC.method6();
        objC.overrideMethod();

        // Calling overridden method using superclass reference
        A refB = new B();
        A refC = new C();
        refB.overrideMethod(); // Calls B's overrideMethod
        refC.overrideMethod(); // Calls C's overrideMethod
    }
}