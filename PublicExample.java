public class PublicExample {
    public String message = "Hello from PublicExample!";

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.displayMessage();
    }
}