/**
 * Represents a general gear item with common properties.
 */
public class GearItem {
    private String brand;
    private double price;
    private boolean available;

    /**
     * No-argument constructor
     */
    public GearItem() {
        this.brand = "";
        this.price = 0.0;
        this.available = true; // Default to available
    }

    /**
     * Parameterized constructor
     */
    public GearItem(String brand, double price, boolean available) {
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    /**
     * Accessor methods
     */
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    /**
     * Mutator method
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * toString method
     */

    public String toString() {
        return "Brand: " + brand + ", Price: $" + price + ", Available: " + available;
    }
}

