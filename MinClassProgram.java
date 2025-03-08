
abstract class AbstractClass {
  
    abstract void abstractMethod();

  
    void nonAbstractMethod() {
        System.out.println("Non-abstract method in AbstractClass.");
    }
}


class ChildClass extends AbstractClass {
 
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildClass.");
    }
}

public class MinClassProgram {
    public static void main(String[] args) {
    
        ChildClass obj = new ChildClass();
        obj.nonAbstractMethod();
    }
}