class DefaultClass {
    String defaultField = "This is a default field";
    void defaultMethod() {
        System.out.println("This is a default method");
    }

    public static void main(String[] args) { // Added main method here
        DefaultClass obj = new DefaultClass();
        System.out.println(obj.defaultField);
        obj.defaultMethod();
    }
}
class AccessDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println(obj.defaultField);
        obj.defaultMethod();
    }
}