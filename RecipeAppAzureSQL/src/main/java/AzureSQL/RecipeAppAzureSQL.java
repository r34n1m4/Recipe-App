package AzureSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class RecipeAppAzureSQL {

    @Autowired
    private RecipeRepo recipeRepo;

    @PostMapping("/addrecipe")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return recipeRepo.findAll();
    }

    @Autowired
    private IngredientsRepo ingrRepo;
    @PostMapping("/addingredient")
    public Ingredients addIngredients(@RequestBody Ingredients ingredients) {
        return ingrRepo.save(ingredients);
    }

    @GetMapping("/ingredients")
    public List<Ingredients> getIngredients() {
        return ingrRepo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(RecipeAppAzureSQL.class, args);
    }
}
