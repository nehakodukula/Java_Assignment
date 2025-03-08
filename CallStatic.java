class CallStatic {

    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    public static void main(String[] args) {
        CallStatic obj = new CallStatic(); // Create object of CallStatic
        staticMethod(); 
        obj.instanceMethod(); 
    }
}