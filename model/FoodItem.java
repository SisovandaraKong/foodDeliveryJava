package foodDeliveryApplication.model;

public class FoodItem extends MenuItem {
    private String[] ingredients;

    public FoodItem(String name, float price, String description, String[] ingredients) {
        super(name, price, description);
        this.ingredients = ingredients;
    }

    @Override
    public String getDetails() {
        return String.format("Food: %s (%.2f)\nDescription: %s\nIngredients: %s",
                name, price, description, String.join(", ", ingredients));
    }
}
