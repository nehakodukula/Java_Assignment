class StaticExample {
    int instanceVar1 = 10;
    int instanceVar2 = 20;
    
    static void staticMethod() {
        // Cannot access instance variables directly in a static method
        // System.out.println(instanceVar1); // This will cause an error
        // System.out.println(instanceVar2); // This will also cause an error
    }
    
    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    public void instanceMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'instanceMethod'");
    }
}