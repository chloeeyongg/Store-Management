import java.util.Scanner;

/**
 * Main class to interact with the snow gear rental shop.
 */
public class StoreRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GearInteraction gearInteraction = new GearInteraction(scanner);

        /**
         * Starting question for the user what they want to rent
         */
        System.out.println("Do you want to rent a snowboard/skis/nothing?");
        System.out.println("(Enter 'snowboard', 'skis', or 'nothing'): ");
        String choice = scanner.nextLine();

        /**
         * Choices the user would choose (snowboard, skis, or nothing)
         */
        if (choice.equals("snowboard")) {
            Snowboard snowboard = gearInteraction.createSnowboard();
            System.out.println("Snowboard added: " + snowboard);
        } else if (choice.equals("skis")) {
            Skis skis = gearInteraction.createSkis();
            System.out.println("Skis added: " + skis);
        } else if (choice.equals("nothing")) {
            System.out.println("No entries added. Exiting.");
        } else {
            System.out.println("Invalid option. Please enter 'snowboard', 'skis', or 'nothing'.");
        }

        /**
         * Ends with a thank you after finishing renting
         */
        scanner.close();
        System.out.println("\nThank you for using the Snow Gear Rental Shop!");
    }
}
