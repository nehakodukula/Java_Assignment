public class MethodThrowsException {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("This is an exception");
    }

    public static void main(String[] args) {
        throwException(); 
    }
}