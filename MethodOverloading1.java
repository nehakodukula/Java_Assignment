class MethodOverloading1 {
    // Method with one parameter
    void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters of the same type
    void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.display(10);
        obj.display(20, 30);
    }
}