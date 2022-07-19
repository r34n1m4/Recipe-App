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
    private RecipeRepo repo;

    @PostMapping("/addrecipe")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return repo.save(recipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return repo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(RecipeAppAzureSQL.class, args);
    }
}
