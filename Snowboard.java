/**
 * Represents a snowboard, extending GearItem with additional properties.
 */
public class Snowboard extends GearItem {
    private String length; // Length of the snowboard

    /**
     * No-argument constructor
     */
    public Snowboard() {
        super();
        this.length = "";
    }

    /**
     * Parameterized constructor
     */
    public Snowboard(String brand, double price, boolean available, String length) {
        super(brand, price, available);
        this.length = length;
    }

    /**
     * Accessor method for length
     */
    public String getLength() {
        return length;
    }

    /**
     * toString method
     */
  
    public String toString() {
        return super.toString() + ", Length: " + length;
    }
}

