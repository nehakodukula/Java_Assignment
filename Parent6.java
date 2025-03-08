class Parent6 {
    void parentMethod() {
        System.out.println("Parent class method");
    }

    public static void main(String[] args) {
        Example6 obj = new Example6();
        obj.childMethod();
    }
}

class Example6 extends Parent6 {
    void childMethod() {
        System.out.println("Child class method");
        this.show();
        super.parentMethod(); 
    }

    void show() {
        System.out.println("Another method in child class");
    }
}