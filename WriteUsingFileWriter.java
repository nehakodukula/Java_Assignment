import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        String data = "Writing to a file using FileWriter";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(data);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
