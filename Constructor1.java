class Constructor1 {
    // Default constructor
    Constructor1() {
        System.out.println("Default Constructor Called");
    }

    // One-argument constructor
    Constructor1(int a) {
        System.out.println("One-Argument Constructor Called with value: " + a);
    }

    // Two-argument constructor
    Constructor1(int a, String b) {
        System.out.println("Two-Argument Constructor Called with values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Constructor1 obj1 = new Constructor1();
        Constructor1 obj2 = new Constructor1(10);
        Constructor1 obj3 = new Constructor1(20, "Hello");
    }
}