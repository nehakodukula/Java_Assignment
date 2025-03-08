import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        String data = "Buffered Writer Example";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(data);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}