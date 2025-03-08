interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass7 implements ChildInterface {
    public void parentMethod() {
        System.out.println("Implemented parentMethod");
    }

    public void childMethod() {
        System.out.println("Implemented childMethod");
    }

    public static void main(String[] args) {
        MyClass7 obj = new MyClass7();
        obj.parentMethod();
        obj.childMethod();
    }
}