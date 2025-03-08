class OverloadExample4 {
  
    void display(int a, int b) {
        System.out.println("Integer parameters: " + a + ", " + b);
    }

    void display(int a, double b) {
        System.out.println("Integer and double parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadExample4 obj = new OverloadExample4();
        obj.display(5, 10);
        obj.display(5, 10.5);
    }
}