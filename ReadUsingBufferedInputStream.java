import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"))) {
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}