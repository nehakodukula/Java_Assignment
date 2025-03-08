class Example1 {
    int value = 10;

    void display() {
        System.out.println("Without using this: " + value);
        System.out.println("Using this: " + this.value);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.display();
    }
}