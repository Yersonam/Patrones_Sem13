package PD_PROTOTYPE;

import java.util.ArrayList;
import java.util.List;

// Prototype interface
interface SandwichPrototype {
    SandwichPrototype clone();
}

// Concrete prototype
class Sandwich implements SandwichPrototype {
    private List <String> ingredients;

    public Sandwich() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public SandwichPrototype clone() {
        Sandwich sandwichClone = new Sandwich();
        for (String ingredient : this.ingredients) {
            sandwichClone.addIngredient(ingredient);
        }
        return sandwichClone;
    }

    @Override
    public String toString() {
        return "Sandwich with ingredients: " + ingredients.toString();
    }
}

