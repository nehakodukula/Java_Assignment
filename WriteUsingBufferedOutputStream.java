import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String data = "Buffered OutputStream Example";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write(data.getBytes());
            bos.flush();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}