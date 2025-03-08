import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}