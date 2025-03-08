interface StaticFinalInterface {
    static final int CONSTANT = 500;
}

class MyClass11 {
    public static void main(String[] args) {
        System.out.println("Static final variable: " + StaticFinalInterface.CONSTANT);
    }
}