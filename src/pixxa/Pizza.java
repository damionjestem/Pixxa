package pixxa;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<Ingredient> ingredients = new ArrayList<>();

    public Pizza() {
        this.ingredients.clear();
    }

    public void addIngredient(Ingredient ing) {
        this.ingredients.add(ing);
        System.out.println("Added " + ing);
    }

}

class Ingredient {

    private String name;
    private Type type;

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Ingredient(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "Type: " + this.type;
    }

}

enum Type {
    MEAT,
    CHEESE,
    VEGE,
    FISH,
    VARIOUS;
}
