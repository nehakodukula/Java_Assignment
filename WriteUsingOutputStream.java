import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String data = "Hello, this is a test message!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}