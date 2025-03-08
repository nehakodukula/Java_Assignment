import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            switch (number % 2) {
                case 0:
                    System.out.println("\"" + number + "\" is even.");
                    break;
                case 1:
                    System.out.println("\"" + number + "\" is odd.");
                    break;
            }
        }
    }
}