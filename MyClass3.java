interface MyInterface3 {
    void show();
}

class MyClass3 implements MyInterface3 {
    public void show() {
        System.out.println("Implemented show() method in MyClass3");
    }

    public static void main(String[] args) {
        MyInterface3 obj = new MyClass3();  
        obj.show();
    }
}