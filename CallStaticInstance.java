class CallStaticInstance {

    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    public static void main(String[] args) {
        CallStaticInstance obj = new CallStaticInstance(); // Create object of CallStaticInstance
        staticMethod(); 
        obj.instanceMethod(); 
    }
}