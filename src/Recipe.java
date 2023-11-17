import java.util.LinkedList;

public class Recipe {
    private String name;
    private LinkedList <Ingredient> listOfIngredients = new LinkedList<>();
    public Recipe(String name){
        this.name = name;
    }
    public void addIngredient(Ingredient ingredient){
        listOfIngredients.add(ingredient);
    }

    @Override
    public String toString() {
        return "Dish Name: "+name+"\n"+"listOfIngredients:\n"+listOfIngredients;
    }
}