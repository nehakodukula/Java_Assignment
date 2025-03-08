class PrivateClass {
    private String privateField = "This is a private field";
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        System.out.println(obj.privateField); // Accessing private field within the same class
        obj.privateMethod(); 
    }
}