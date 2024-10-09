 import java.util.Scanner;

/**
 * User interaction for creating gear items
 */
public class GearInteraction {
    private Scanner scanner;

    public GearInteraction(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Asks questions about the snowboard.
     */ 
    public Snowboard createSnowboard() {
        System.out.print("Enter snowboard brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter snowboard price: ");
        double price = scanner.nextDouble();
        System.out.print("Is the snowboard available? (true/false): ");
        boolean available = scanner.nextBoolean();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter snowboard length: ");
        String length = scanner.nextLine();

        return new Snowboard(brand, price, available, length);
    }

    /**
     * Asks questions about the skis.
     */
    public Skis createSkis() {
        System.out.print("Enter skis brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter skis price: ");
        double price = scanner.nextDouble();
        System.out.print("Is the skis available? (true/false): ");
        boolean available = scanner.nextBoolean();
        scanner.nextLine(); 
        System.out.print("Enter skis type: ");
        String type = scanner.nextLine();

        return new Skis(brand, price, available, type);
    }
}