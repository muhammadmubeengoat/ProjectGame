import java.util.LinkedList;

public class Breakfast{
    private LinkedList<Recipe> listOfBreakfasts = new LinkedList<>();
    private RecipeManager recipeManager = new RecipeManager();
    public Breakfast(){
        addDishes();
    }
    public void addDishes(){
        listOfBreakfasts.add(recipeManager.readRecipe("D:\\Work\\DSA\\ProjectGame\\Breakfast\\Tea.txt","Tea"));
    }
    public void cook(){
        for(int i=0;i<listOfBreakfasts.size();i++){
            System.out.println(listOfBreakfasts.get(i));
        }
    }
}