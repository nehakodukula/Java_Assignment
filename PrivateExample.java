public class PrivateExample {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private field: " + obj.privateField);
        obj.privateMethod();
    }
}

