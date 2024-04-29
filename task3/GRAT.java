package midterm.lizi_zarkua_1.task3;

import java.util.Arrays;

public class GRAT {
    public static void main(String[] args) {
        GeorgianRecipe recipe1 = new GeorgianRecipe();
        recipe1.setName("Khachapuri");
        recipe1.setRegion("Adjarian");
        recipe1.setDescription("A traditional Georgian cheese-filled bread.");
        recipe1.setIngredients(Arrays.asList("Flour", "Cheese", "Eggs", "Butter"));
        recipe1.setInstructions("Mix the ingredients, shape the dough, add cheese, bake in the oven.");

        GeorgianRecipe recipe2 = new GeorgianRecipe();
        recipe2.setName("Khinkali");
        recipe2.setRegion("Khalakhuri");
        recipe2.setDescription("A traditional Georgian dumpling filled with spiced meat.");
        recipe2.setIngredients(Arrays.asList("Flour", "Ground beef", "Onion", "Spices"));
        recipe2.setInstructions("Prepare the filling, make dough pockets, fill with the filling, boil.");

        GeorgianRecipeArchive archive = new GeorgianRecipeArchive();
        archive.addRecipe(recipe1);
        archive.addRecipe(recipe2);

        archive.removeRecipe(recipe1);
        
        archive.printRecipes();
    }
}


