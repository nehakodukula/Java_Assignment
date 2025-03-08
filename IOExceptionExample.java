import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            throw new IOException("This is an IOException");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}