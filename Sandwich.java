// Sandwich.java
public class Sandwich {
    // Data fields
    private String mainIngredient;
    private String breadType;
    private double price;

    // Constructor to initialize the Sandwich object
    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    // Getter method for mainIngredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    // Setter method for mainIngredient
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Getter method for breadType
    public String getBreadType() {
        return breadType;
    }

    // Setter method for breadType
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display sandwich details
    public void displaySandwichInfo() {
        System.out.println("Main Ingredient: " + mainIngredient);
        System.out.println("Bread Type: " + breadType);
        System.out.println("Price: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Sandwich object
        Sandwich mySandwich = new Sandwich("Tuna", "Wheat", 4.99);
        
        // Display sandwich information
        mySandwich.displaySandwichInfo();
        
        // Change values using setters
        mySandwich.setMainIngredient("Chicken");
        mySandwich.setBreadType("Rye");
        mySandwich.setPrice(5.49);
        
        // Display updated sandwich information
        mySandwich.displaySandwichInfo();
    }
}
