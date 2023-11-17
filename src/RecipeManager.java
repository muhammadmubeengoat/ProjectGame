import javax.naming.StringRefAddr;
import java.io.File;
import java.util.Scanner;

public class RecipeManager {
    public Recipe readRecipe(String filename, String recipeName){
        Recipe recipe = new Recipe(recipeName);
        String name = null;
        int quantity = 0;
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[]parts = line.split(",");
                if(parts.length==2){
                    name = parts[0];
                    quantity = Integer.parseInt(parts[1].trim());
                    Ingredient ingredient = new Ingredient(name,quantity);
                    recipe.addIngredient(ingredient);
                }
                else{
                    System.out.println("Recipe Not Found");
                }
            }
        }catch(Exception exception){
            System.out.println("File Not Found: "+ exception.getMessage());
        }
        return recipe;
    }
}
