interface MyInterface2 {
    void method1();
    void method2(); 
}

class MyClass2 implements MyInterface2 {
    public void method1() {
        System.out.println("Implemented method1 in MyClass2");
    }

    public void method2() {
        System.out.println("Implemented method2 in MyClass2");
    }

    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.method1();
        obj.method2();
    }
}