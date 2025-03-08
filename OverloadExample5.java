class OverloadExample5 {
  
    int display(int a) {
        return a * 2;
    }


    public static void main(String[] args) {
        OverloadExample5 obj = new OverloadExample5();
        System.out.println("Integer method output: " + obj.display(5));
    }
}