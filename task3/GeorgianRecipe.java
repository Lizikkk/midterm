package midterm.lizi_zarkua_1.task3;

import java.util.List;

public class GeorgianRecipe{
    private String name, region;
    private String description;
    private List<String> ingredients;
    private String instructions;


    public String getName() {
        return name;
        }

    public void setName(String name) { 
        this.name = name;
        }

    public String getRegion() {
        return region;
         }

    public void setRegion(String region) {
         this.region = region;
        } 

    public String getDescription() {
        return description;
        }
    
    public void setDescription(String description) {
            this.description = description;
        }
    
        public void setIngredients(List<String> ingredients) {
            this.ingredients = ingredients;
        }

        public List<String> getIngredients(){
            return ingredients;
        }
    
        public String getInstructions() {
            return instructions;
        }
    
        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }
    
    
}
