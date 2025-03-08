import java.util.Scanner;

public class PrintGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter M for Male or F for Female: ");
        char gender = scanner.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid gender input.");
        }
    }
}