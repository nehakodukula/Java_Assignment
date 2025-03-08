class Example4 {
    Example4() {
        this(20); // Calls the parameterized constructor
    }

    Example4(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new Example4();
    }
}