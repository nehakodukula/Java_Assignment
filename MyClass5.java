interface InterfaceX {
    void commonMethod();
}

interface InterfaceY {
    void commonMethod();
}

class MyClass5 implements InterfaceX, InterfaceY {
    public void commonMethod() {
        System.out.println("Implemented commonMethod from both interfaces");
    }

    public static void main(String[] args) {
        MyClass5 obj = new MyClass5();
        obj.commonMethod();
    }
}