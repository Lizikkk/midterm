package midterm.lizi_zarkua_1.task3;
import java.util.ArrayList;
import java.util.List;


public class GeorgianRecipeArchive {
    private List<GeorgianRecipe> storage = new ArrayList<>();

    // Add a recipe to the archive
    public void addRecipe(GeorgianRecipe recipe) {
        storage.add(recipe);
    }

    // Remove a recipe from the archive
    public boolean removeRecipe(GeorgianRecipe recipe) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            GeorgianRecipe r = storage.get(i);
            if (r.getName().equals(recipe.getName()) && r.getRegion().equals(recipe.getRegion())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }


    public void printRecipes() {
        if (storage.isEmpty()) {
            System.out.println("The archive is empty");
        } else {
            for (GeorgianRecipe r : storage) {
                System.out.println(r.getName() + ", " + r.getRegion());
                System.out.println(r.getDescription());
                System.out.println("Ingredients: " + r.getIngredients());
                System.out.println("Instructions: " + r.getInstructions());
                System.out.println();
            }
        }
    }
}
