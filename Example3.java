class Example3 {
    Example3() {
        this(10); // Calls the parameterized constructor
        System.out.println("Default constructor");
    }

    Example3(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new Example3();
    }
}