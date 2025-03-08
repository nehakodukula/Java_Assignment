interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass4 implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Implemented methodA");
    }

    public void methodB() {
        System.out.println("Implemented methodB");
    }

    public static void main(String[] args) {
        MyClass4 obj = new MyClass4();
        obj.methodA();
        obj.methodB();
    }
}