class OverloadExample2 {
   
    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    void display(String a, double b) {
        System.out.println("String and double parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadExample2 obj = new OverloadExample2();
        obj.display(10);
        obj.display("Hello", 5.5);
    }
}