package it.marczuk.babcia_zosia_cook_book.repository;

import it.marczuk.babcia_zosia_cook_book.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Long> {

    List<Recipe> getRecipeByName(String name);
}
