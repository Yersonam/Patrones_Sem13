package PD_PROTOTYPE;

public class SandwichShop {
    public static void main(String[] args) {
        // Create the base sandwich with common ingredients
        Sandwich baseSandwich = new Sandwich();
        baseSandwich.addIngredient("Bread");
        baseSandwich.addIngredient("Lettuce");
        baseSandwich.addIngredient("Tomato");

        // Customer 1 wants a sandwich with cheese
        Sandwich customer1Sandwich = (Sandwich) baseSandwich.clone();
        customer1Sandwich.addIngredient("Cheese");
        System.out.println("Customer 1: " + customer1Sandwich);

        // Customer 2 wants a sandwich with ham
        Sandwich customer2Sandwich = (Sandwich) baseSandwich.clone();
        customer2Sandwich.addIngredient("Ham");
        System.out.println("Customer 2: " + customer2Sandwich);

        // Customer 3 wants a sandwich with cheese and ham
        Sandwich customer3Sandwich = (Sandwich) baseSandwich.clone();
        customer3Sandwich.addIngredient("Cheese");
        customer3Sandwich.addIngredient("Ham");
        System.out.println("Customer 3: " + customer3Sandwich);
    }
}

