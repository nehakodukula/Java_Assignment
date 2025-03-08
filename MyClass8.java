interface PublicInterface {
    int VALUE = 100;  // Public, static, and final by default

    void displayValue();
}

class MyClass8 implements PublicInterface {
    public void displayValue() {
        System.out.println("Value from interface: " + VALUE);
    }

    public static void main(String[] args) {
        MyClass8 obj = new MyClass8();
        obj.displayValue();
    }
}