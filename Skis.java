/**
 * Represents a pair of skis, extending GearItem with additional properties.
 */
public class Skis extends GearItem {
    private String type; // Type of skis (e.g., alpine, cross-country)

    /**
     * No-argument constructor
     */
    public Skis() {
        super();
        this.type = "";
    }

    /**
     * Parameterized constructor
     */
    public Skis(String brand, double price, boolean available, String type) {
        super(brand, price, available);
        this.type = type;
    }

    /**
     * Accessor method for type
     */
    public String getType() {
        return type;
    }

    /**
     * toString method
     */

    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
