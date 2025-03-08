import java.lang.reflect.*;

class Sample {
    public int field;
}

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            Sample.class.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}