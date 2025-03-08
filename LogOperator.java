import java.util.Scanner;

public class LogOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();
        
        System.out.println("Logical AND (a && b): " + (a && b));
        System.out.println("Logical OR (a || b): " + (a || b));
        System.out.println("Logical NOT (!a): " + (!a));
        
        sc.close();
    }
}