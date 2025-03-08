class CallInstance {

    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    static void staticMethod() {
        CallInstance obj = new CallInstance(); // Create object of CallInstance
        obj.instanceMethod(); 
    }

    public static void main(String[] args) {
        staticMethod();
    }
}