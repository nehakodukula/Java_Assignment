class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}