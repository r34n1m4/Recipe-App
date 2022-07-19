package AzureSQL;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepo
        extends JpaRepository<Ingredients, Integer> {
}
