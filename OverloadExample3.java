class OverloadExample3 {
  
    void display(int a, int b) {
        System.out.println("Method 1: " + a + ", " + b);
    }
    public static void main(String[] args) {
        OverloadExample3 obj = new OverloadExample3();
        obj.display(5, 10);
    }
}