interface MyInterface6 {
    default void defaultMethod() {
        System.out.println("Default method in Interface");
    }
}

class MyClass6 implements MyInterface6 {
    public static void main(String[] args) {
        MyClass6 obj = new MyClass6();
        obj.defaultMethod();
    }
}